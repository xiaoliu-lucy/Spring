package hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
						
			// start a transaction
			session.beginTransaction();
			
			// get all student from database
			List<Student> studentList = session.createQuery("from Student").getResultList();
			
			// Display all student 
			System.out.println("Print out all student");
			for (Student temp : studentList) {
				System.out.println(temp);
			}
			
			// commit transaction
			session.getTransaction().commit();
			
			
			
			// Get all student with last name Doe
			session = factory.getCurrentSession();
			session.beginTransaction();
			List<Student> studentDoe = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();
			
			// Display result 
			for (Student temp : studentDoe) {
				System.out.println(temp);
			}
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		} 
		finally {
			factory.close();
		}
	}

}
