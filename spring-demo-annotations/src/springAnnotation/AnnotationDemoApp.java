package springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach alpha = context.getBean("alphaCoach",Coach.class);
		// call method of the bean
		System.out.println("Test @Component annotation");
		System.out.println(alpha.getWorkout());
		
		System.out.println("Test @Autowired constructor annotation");
		FortuneCoach beta = context.getBean("fortuneCoach",FortuneCoach.class);
		System.out.println(beta.getFortune());
		
		System.out.println("Test @Autowired setter annotation");
		FortuneCoach2 gamma = context.getBean("fortuneCoach2",FortuneCoach2.class);
		System.out.println(gamma.getFortune());
		
		System.out.println("Test @Autowired method annotation");
		FortuneCoach3 delta = context.getBean("fortuneCoach3",FortuneCoach3.class);
		System.out.println(delta.getFortune());
		
		System.out.println("Test @Autowired field annotation");
		FortuneCoach4 epsilon = context.getBean("fortuneCoach4",FortuneCoach4.class);
		System.out.println(epsilon.getFortune());
		
		System.out.println("Test @Qualifier annotation");
		
		
		// close the context
		context.close();
	}

}
