
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateOperations_test{


	public static void main(String[] args)  { 
		Date date=new Date();
		Date d1=getDateAfterDays(date,100);
		System.out.println(d1);
		Date d2=getDateAfterWeeks(date, 3);
		System.out.println(d2);
		Date d3=getDateBeforeMonths(date,2);
		System.out.println(d3);
		
 
	}
	private static Date getDateAfterDays(Date date, int days) {//functia care socoate cedata va fi peste 100 de zile //
		GregorianCalendar calendar=new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return (Date) calendar.getTime();
	}

	private static Date getDateAfterWeeks(Date date, int weeks) {//functia care socoate ce data va fi peste 3 saptamini //
		GregorianCalendar calendar=new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH,weeks);
		return getDateAfterDays(date,weeks*7);
	}
	private static Date getDateBeforeMonths(Date date,int month){//functia care socoate ce data va fi peste 2luni //
		GregorianCalendar calendar=new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH,month);
		return calendar.getTime();
	}
	
	}



