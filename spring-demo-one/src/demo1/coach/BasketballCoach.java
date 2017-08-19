package demo1.coach;

public class BasketballCoach implements Coach {
	private FortuneService myFortuneService;
	private String email;
	private String teamName;
	
	public BasketballCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	@Override
	public String getWorkout() {
		return "run 5k basketball";
	}
	@Override
	public String getFortune() {
		return myFortuneService.getFortune();
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
}
