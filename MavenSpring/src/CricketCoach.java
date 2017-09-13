
public class CricketCoach implements Coach{
	private FortuneInterface finterface;
	String val;
	public CricketCoach() {
		
	}
	//Constructor Injection
	public CricketCoach(FortuneInterface fi) {
		
		finterface = fi;
		val="Constructor";
	}
	
	
	
	public void setFortuneService(FortuneInterface fi) {
		this.finterface = fi;
		val="Setter";
		
	}
	public String getDailyWorkout() {
		return "Sure";
	}
	//Setter Injection
	public String getFortuneService() {
		
		return val+finterface.getFortuneService();
	}
	
}
