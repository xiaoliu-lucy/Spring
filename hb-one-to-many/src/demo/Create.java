package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.entity.Course;
import demo.entity.Instructor;
import demo.entity.InstructorDetail;

public class Create {
	public static void main(String args[]) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		// get session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create objects
			Instructor tempInstructor = 
					new Instructor("Susan", "Public", "susan.public@luv2code.com");
			
			InstructorDetail tempInstructorDetail =
					new InstructorDetail(
							"http://www.youtube.com",
							"Video Games");	
			
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
			session.close();
			factory.close();
			
		}
	}
}
