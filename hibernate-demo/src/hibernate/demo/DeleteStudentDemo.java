package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 2;
			
			// start a transaction
			session.beginTransaction();

			// retrieve student based on id:
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
	
			System.out.println("Get complete: " + myStudent);
			
			// update student
			System.out.println("Deleting student...");
			session.delete(myStudent);
						
			// Commit transaction
			session.getTransaction().commit();
			
			// Start new session, delete student with id 1
			session = factory.getCurrentSession();
			session.beginTransaction();
			studentId = 2;
			session.createQuery("delete from Student where id = " + studentId).executeUpdate();
			
			session.getTransaction().commit();			
			
			System.out.println("Done");
		} 
		finally {
			factory.close();
		}
	}

}