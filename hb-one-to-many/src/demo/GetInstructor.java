package demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.entity.Course;
import demo.entity.Instructor;
import demo.entity.InstructorDetail;

public class GetInstructor {
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
			System.out.println("Instructor: " + tempInstructor);
			
			// get courses for the instructor			
			System.out.println("Courses: " + tempInstructor.getCourses());
			
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
