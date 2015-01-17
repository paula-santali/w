
public class test_Eurovision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Eurovision par1=new Eurovision();
	    par1.setCountry("Israel");
	    par1.setNameSinger("Mei Feingold");
	    par1.setSingel("Time");
	    par1.display();
		
		Eurovision par2=new Eurovision("Moldova","Geta Burlacu","A Centure of Love");
		par2.display();
		
		InfoEurovision par3=new InfoEurovision("Italia","Emma Marrone","La miacitta","Antonio Viccini",3.31);
		par3.display();

	}

}
