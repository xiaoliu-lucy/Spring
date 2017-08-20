package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FortuneCoach4 implements Coach {
	// field injection
	@Autowired
	@Qualifier("happyFortune")
	private FortuneService myFortuneService;
	
		
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	
	@Override
	public String getWorkout() {
		return "Lucky cheat day";
	}
	
}
