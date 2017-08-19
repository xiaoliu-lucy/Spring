package demo1.coach;

public class TrackCoach implements Coach {
	private FortuneService myFortuneService;
	public TrackCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	@Override
	public String getWorkout() {
		return "Run a hard 5k";
	}
	@Override
	public String getFortune() {
		return myFortuneService.getFortune();
	}
}










