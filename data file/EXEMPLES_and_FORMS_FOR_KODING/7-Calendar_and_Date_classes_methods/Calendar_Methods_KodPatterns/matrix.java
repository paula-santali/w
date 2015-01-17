package Calendar_Methods_KodPatterns;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class matrix {
public static void main(String[] args) {
int [][]matrix;
matrix=matWeek(2013);
int mounth = 02;
int dayOfMounth = 20;
switch(matrix[mounth][dayOfMounth ])
{
case 1:System.out.println("Monday");break;
case 2:System.out.println("Tuesday");break;
case 3:System.out.println("Wednesday");break;
case 4:System.out.println("Thursday");break;
case 5:System.out.println("Friday");break;
case 6:System.out.println("Saturday");break;
case 7:System.out.println("Sunday");break;
default:;
}
}
private static int[][] matWeek(int year) {
	int [][]matrix=new int[12][32];
	Calendar cl=new GregorianCalendar(year,01,01);
	while(cl.get(Calendar.YEAR)==year){
		int mounce=cl.get(Calendar.MONTH);
		int day=cl.get(Calendar.DAY_OF_MONTH);
		int weekday=cl.get(Calendar.DAY_OF_WEEK);
		matrix[mounce][day]=weekday;
		cl.add(Calendar.DAY_OF_YEAR, 1);
		}
	return matrix;
}
}
