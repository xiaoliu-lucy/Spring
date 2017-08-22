package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session to save a java object
	
			// create student object
			System.out.println("Creating new student objects...");
			Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
			Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
			Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save a student object
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		} 
		finally {
			factory.close();
		}
	}
}
