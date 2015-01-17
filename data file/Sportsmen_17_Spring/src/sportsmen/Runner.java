
package sportsmen;


public class Runner implements Sportsman {
    
	int speed = 10;//skorosti
	
	public Runner(){
		
	}
	
	public Runner(int speed){
		this.speed = speed;
	}
	
	public void setSpeed(int speed){
		this.speed=speed;
	}
	
	@Override
	public void action() {
		System.out.println("I'm running with speed " + speed + "km/h");
	}

}
