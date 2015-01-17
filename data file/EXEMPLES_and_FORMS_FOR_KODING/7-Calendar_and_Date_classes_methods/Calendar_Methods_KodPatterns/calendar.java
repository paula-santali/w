package Calendar_Methods_KodPatterns;
import java.util.Date;
import java.util.GregorianCalendar;
public class calendar {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		printCalendar(2012);
		printMounce(44,44,44,44,5);
	}

	private static void printCalendar(int year) {
	Date date=new Date();
	GregorianCalendar gc=new GregorianCalendar();
	gc.setTime(date);
	
	System.out.println(date);
	int d=10;
	for(int i=0,m=0;i<d;d--){
	//System.out.print(" "+(gc.getWeekYear()-	m));
	m++;                                            
	//    new SimpleDateFormat("dd:MM:yyyy").format(NameHolder);// cum scriem formatul asha trebue si sal dam
	}
	}
	private static void printMounce(int mo,int day,int id1,int id2,int id3){
		System.out.println();
	String[] mounce ={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OKTOBER","NOVEMBER","DECEMBER"};
	String[] weekdays ={"SU: ","MO: ","TU: ","WE: ","TH: ","FR: ","ST: "};
	
	System.out.println(mounce[id3]);
	
		
		
		
	}
}
