package springAnnotation;

import org.springframework.stereotype.Component;

@Component("alphaCoach")
public class AlphaCoach implements Coach {

	@Override
	public String getWorkout() {
		return "workout from alpha coach";
	}

}
