package Calendar_Methods_KodPatterns;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemplePrintCalendar {
	public static void main(String[] args) {
		printCalendar( 2014 );
	}
	private static void printCalendar( int year ) {
		int WeekDay1d;
		String[] months ={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OKTOBER","NOVEMBER","DECEMBER"};
	    String[] weekdays ={"SU: ","MO: ","TU: ","WE: ","TH: ","FR: ","ST: "};

	for (int i = 0; i < months.length; i++ ){
		System.out.println( "     "+months[ i ] );
		WeekDay1d = WeekDay1( i ); 

		for ( int j = 0; j < weekdays.length ; j++ ){
			System.out.print( weekdays[ j ] );
			printStringDaysOfWeekDay( year, i, j + 1, WeekDay1d );
		}
	}  
}

private static int WeekDay1(int i) {
	GregorianCalendar cd = new GregorianCalendar();
	cd.set( Calendar.MONTH, i );
	cd.set( Calendar.DAY_OF_MONTH, 1 );
	return cd.get(Calendar.DAY_OF_WEEK );
}

private static void printStringDaysOfWeekDay( int year, int month, int day_of_week, int weekDay ){
	int endMonth, day = 0;
	GregorianCalendar cd = new GregorianCalendar();
	cd.set( Calendar.YEAR, year );
	cd.set( Calendar.MONTH, month );
	cd.set( Calendar.DAY_OF_WEEK, day_of_week );

	for ( int i = 1; i < 8; i++ ){
		cd.set( Calendar.DAY_OF_MONTH, i );
		if ( cd.get( Calendar.DAY_OF_WEEK ) == day_of_week )
			day = cd.get( Calendar.DAY_OF_MONTH );
	}

	endMonth = cd.getActualMaximum( Calendar.DAY_OF_MONTH );
	if ( day > ( 8 - weekDay ) )
		System.out.print("  ");
	while ( day <= endMonth ) { 
		if ( weekDay < 6 ){
			if ( ( ( weekDay + day ) > 8 ) && ( ( weekDay + day ) < 15 ) && ( day < 10 )  )
				System.out.print(" ");
		}
		else
			if ( ( weekDay == 7 ) && ( day == 9 ) )
				System.out.print(" ");

		System.out.print( day + " " );
			day = day + 7;
		}
		System.out.println();
	}
}