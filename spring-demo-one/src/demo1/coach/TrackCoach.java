package demo1.coach;

public class TrackCoach implements Coach {
	private FortuneService myFortuneService;
	private String email;
	private String teamName;
	public TrackCoach() {

	}
	@Override
	public String getWorkout() {
		return "Run a hard 5k";
	}
	@Override
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	// setter method for injection

	public void setFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	// init method
	public void doMyStartupStuff() {
		System.out.println("Track coach initialize method");
	}
	// destroy method
	public void doMyDestoryStuff() {
		System.out.println("Track coach destory method");
	}
}










