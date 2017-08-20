package springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean from spring container
		Coach alpha = context.getBean("alphaCoach",Coach.class);
		// call method of the bean
		System.out.println(alpha.getWorkout());
		// close the context
		context.close();
	}

}
