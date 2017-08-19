package demo1.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		String coachReq = "basketballCoach";
		Coach theCoach = context.getBean(coachReq, Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getFortune());
		
		// close the context
		context.close();
	}

}







