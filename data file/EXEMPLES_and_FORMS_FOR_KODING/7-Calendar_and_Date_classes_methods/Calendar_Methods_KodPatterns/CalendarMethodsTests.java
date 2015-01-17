package Calendar_Methods_KodPatterns;
import java.util.*;
public class CalendarMethodsTests {
public static Calendar cl = null;
public static Date date = null;
	public static void main(String[] args) {
		printCalendar();// printed day are this calendar
		

	}
	public static void printCalendar() {
	    date = new Date();
		cl = new GregorianCalendar();
		cl.setTime(date);	
		System.out.println(date);
	}
}
