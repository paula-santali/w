
public class InfoEurovision extends Eurovision{
	public String composerSingel;
	public double timeSingel;

	public InfoEurovision(){

	}
	public InfoEurovision(String country,String NameSinger,String singel,String composerSingel,double timeSingel){
		super(country,NameSinger,singel);
		this.composerSingel=composerSingel;
		this.timeSingel=timeSingel;
	}
	public void setComposerSingel(String composerSingel){
		if(composerSingel!="")
			this.composerSingel=composerSingel;
		else
			System.out.println("Error in parameter composer singel ");
	}
	public String getComposerSingel(){

		return composerSingel;
	}
	public void setTimeSingel(int timeSingel){
		if(timeSingel>0)
			this.timeSingel=timeSingel;
		else
			System.out.println("Error in parameter time singel");
	}
	public double getTimeSingel(){
		return timeSingel;
    }
	public void display(){
		super.display();
		System.out.print("  composerSingel->"+composerSingel);
		System.out.print("\ttimeSingel->"+timeSingel);
		

	} 
  }



