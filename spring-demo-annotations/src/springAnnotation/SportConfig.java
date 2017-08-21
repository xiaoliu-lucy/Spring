package springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springAnnotation")
@PropertySource("sport.properties")
public class SportConfig {
	@Bean
	public Coach swimCoach() {
		Coach swimCoach = new SwimCoach(sadFortune());
		return swimCoach;
	}
	
	@Bean
	public FortuneService sadFortune() {
		return new SadFortune();
	}
}
