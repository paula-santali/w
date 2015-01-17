package sportsmen;

public class Footballer implements Sportsman {

    String team = "Macabi";//kamanda
	
	public Footballer(){

	}

	public Footballer(String team){
		this.team = team;	
	}

	public void setTeam(String team){
		this.team = team;
	}
	
	@Override
	public void action() {
		System.out.println("I'm playing football in the team " + team);
	}
}
