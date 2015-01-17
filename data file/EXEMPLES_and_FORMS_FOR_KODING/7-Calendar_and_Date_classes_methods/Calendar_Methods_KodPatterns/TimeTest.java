package Calendar_Methods_KodPatterns;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTest {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("java standart view->  "+date);
		SimpleDateFormat simpleDate=new SimpleDateFormat(" dd/MM/YYYY");
		String sdView=simpleDate.format(date);
		System.out.println("simple date format view-> "+sdView+"\n");
		
		Date d1=getDateAfterDays(date,370);
		String df1=simpleDate.format(d1);
		Date d2=getDateAfterWeeks(date,5);
		String df2=simpleDate.format(d2);
		Date d3=getDateBeforeMounce(date,5);
		String df3=simpleDate.format(d3);
		
		System.out.println("дата дл�? �?четчика     дней ->"+df1);
		System.out.println("дата дл�? �?четчика   недель ->"+df2);
		System.out.println("дата дл�? �?четчика ме�?�?цев  ->"+df3);
	}
	private static Date getDateAfterDays(Date date, int amount) {
		GregorianCalendar greg=new GregorianCalendar();
		greg.setTime(date);
		greg.add(Calendar.DAY_OF_MONTH, amount);
		return greg.getTime();
	}
	private static Date getDateAfterWeeks(Date date, int amount) {
		GregorianCalendar greg=new GregorianCalendar();
		greg.setTime(date);
		greg.add(Calendar.WEEK_OF_MONTH, amount);
		return greg.getTime();
	}
	private static Date getDateBeforeMounce(Date date, int amount) {
		GregorianCalendar greg=new GregorianCalendar();
		greg.setTime(date);
		greg.add(Calendar.MONTH, amount);
		return greg.getTime();
	}

}
