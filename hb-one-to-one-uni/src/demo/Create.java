package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
	public static void main(String args[]) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		// get session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create objects
			Instructor tempInstructor = 
					new Instructor("Chad", "Darby", "darby@luv2code.com");
			
			InstructorDetail tempInstructorDetail =
					new InstructorDetail(
							"http://www.luv2code.com/youtube",
							"Luv 2 code!!!");	
			/*
			Instructor tempInstructor = 
					new Instructor("Madhu", "Patel", "madhu@luv2code.com");
			
			InstructorDetail tempInstructorDetail =
					new InstructorDetail(
							"http://www.youtube.com",
							"Guitar");	
			*/
			
			// associate
			tempInstructor.setDetail(tempInstructorDetail);
			
			// start session
			System.out.println("Start transaction.....");
			session.beginTransaction();
			
			session.save(tempInstructor);
			
		
			// close session
			System.out.println("Done");
			session.getTransaction().commit();
			
			
		}
		
		finally {
			
			factory.close();
			
		}
	}
}
