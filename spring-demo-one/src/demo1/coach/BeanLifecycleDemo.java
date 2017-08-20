package demo1.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifecycle-applicationContext.xml");
		
		// retrieve bean from container
		TrackCoach trackCoach1 = context.getBean("trackCoach",TrackCoach.class);
		
		System.out.println(trackCoach1.getWorkout());
		// close context
		context.close();
	}

}
