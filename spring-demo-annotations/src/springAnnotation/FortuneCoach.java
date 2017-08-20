package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FortuneCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	// Constructor & Constructor injection
	
	@Autowired
	public FortuneCoach (@Qualifier("sadFortune") FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	
	@Override
	public String getWorkout() {
		return "Lucky cheat day";
	}
	
}
