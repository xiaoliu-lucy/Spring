package springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class AlphaCoach implements Coach {

	@Override
	public String getWorkout() {
		return "workout from alpha coach";
	}

}
