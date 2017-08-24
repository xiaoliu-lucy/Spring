package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			
			// start a transaction
			session.beginTransaction();

			// retrieve student based on id:
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
	
			System.out.println("Get complete: " + myStudent);
			
			// update student
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
						
			// Commit transaction
			session.getTransaction().commit();
			
			// Start new session, update email for all student
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set email = 'foo@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();			
			
			System.out.println("Done");
		} 
		finally {
			factory.close();
		}
	}

}