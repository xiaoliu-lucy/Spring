package demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.entity.Course;
import demo.entity.Instructor;
import demo.entity.InstructorDetail;


public class DeleteCourse {
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
				
				int id = 11;
				Course tempCourse = session.get(Course.class, id);
				
				// delete course
				System.out.println("Deleting course: " + tempCourse);
				session.delete(tempCourse);
				
				// close session
				
				session.getTransaction().commit();
				System.out.println("Done");
				
			}
			
			finally {
				
				factory.close();
				
			}
	}
}
