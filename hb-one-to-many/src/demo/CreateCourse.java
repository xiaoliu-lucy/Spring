package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.entity.Course;
import demo.entity.Instructor;
import demo.entity.InstructorDetail;

public class CreateCourse {
	public static void main(String args[]) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		// get session
		Session session = factory.getCurrentSession();
		
		try {
			// start session
			System.out.println("Start transaction.....");
			session.beginTransaction();
		
			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);		
			
			// create some courses
			Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
			Course tempCourse2 = new Course("The Pinball Masterclass");
			
			// add course
			tempInstructor.addCourse(tempCourse1);			
			tempInstructor.addCourse(tempCourse2);		
			
			// save course
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// close session
			session.getTransaction().commit();
			System.out.println("Done");
			
			
		}
		
		finally {
			session.close();
			factory.close();
			
		}
	}
}
