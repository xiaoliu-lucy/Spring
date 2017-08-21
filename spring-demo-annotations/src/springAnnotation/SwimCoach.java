package springAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	private FortuneService myFortuneService;
	
	// Getter
    public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
		
	// Constructor & Constructor injection
	
	public SwimCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	
	@Override
	public String getWorkout() {
		return "Swim 100k for warm up";
	}
	
}
