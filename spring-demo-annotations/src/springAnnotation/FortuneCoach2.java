package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FortuneCoach2 implements Coach {
	private FortuneService myFortuneService;
	
	// Constructor & Constructor injection
	
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	
	public FortuneService getMyFortuneService() {
		return myFortuneService;
	}
	// Setter method for autowired
	@Autowired
	@Qualifier("happyFortune")
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getWorkout() {
		return "Lucky cheat day";
	}
	
}
