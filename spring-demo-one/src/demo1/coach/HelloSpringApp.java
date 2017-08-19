package demo1.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		System.out.println("--test for DI--");
		String coachReq = "trackCoach";
		Coach theCoach = context.getBean(coachReq, Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getWorkout());
		
		// call our new method for fortunes
		System.out.println(theCoach.getFortune());
		// close the context
		
		// Inject values
		TrackCoach trackCoach = context.getBean("trackCoach",TrackCoach.class);
		System.out.println("--test for injecting value--");
		System.out.println(trackCoach.getEmail());
		System.out.println(trackCoach.getTeamName());
		
		
		// Inject value from properties file
		BasketballCoach basketCoach = context.getBean("basketballCoach",BasketballCoach.class);
		System.out.println("--test for injecting value from property file--");
		System.out.println(basketCoach.getEmail());
		System.out.println(basketCoach.getTeamName());
		
		context.close();
	}

}







