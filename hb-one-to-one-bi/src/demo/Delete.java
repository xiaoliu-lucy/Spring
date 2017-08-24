package demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Delete {
	public static void main(String args[]) {
	// Create session factory
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
			
			// get session
			Session session = factory.getCurrentSession();
			
			try {
				
				// start session
				System.out.println("Start transaction.....");
				session.beginTransaction();
				int id = 2;
				Instructor temp = session.get(Instructor.class, id);
						
				session.delete(temp);
				
				// close session
				
				session.getTransaction().commit();
				System.out.println("Done");
				
			}
			
			finally {
				
				factory.close();
				
			}
	}
}
