package demo1.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from container
		BasketballCoach basketballCoach1 = context.getBean("basketballCoach",BasketballCoach.class);
		BasketballCoach basketballCoach2 = context.getBean("basketballCoach",BasketballCoach.class);
		
		// Check if they are same
		boolean result = (basketballCoach1 == basketballCoach2);
		System.out.println("Singleton bean point to the same object: " + result);
		
		TrackCoach trackCoach1 = context.getBean("trackCoach",TrackCoach.class);
		TrackCoach trackCoach2 = context.getBean("trackCoach",TrackCoach.class);
		result = (trackCoach1 == trackCoach2);
		System.out.println("Prototype bean point to the same object: " + result);
		// close context
		context.close();
	}

}
