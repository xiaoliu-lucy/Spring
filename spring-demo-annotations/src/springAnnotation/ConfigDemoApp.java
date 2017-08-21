package springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemoApp {

	public static void main(String[] args) {
		
		// read config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		System.out.println("Test java class configuration");
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(coach.getWorkout());
		System.out.println(coach.getFortune());
		
		System.out.println("Test value injection");
		System.out.println("Email: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());
		context.close();
	}

}
