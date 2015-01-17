package Date_Methods_KodPatterns;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class dateDateTest {

	public static void main(String[] args) {
		Date dt = new Date();
		//System.out.println(dt);//Tue Jun 24 21:59:36 IDT 2014
		String str = dt.toString();
		//System.out.println(str);//Tue Jun 24 21:59:36 IDT 2014	 
		Long h;
		String lMilsec = (h=System.currentTimeMillis()).toString();
		Date beginning = new Date(Long.parseLong(lMilsec));//method Date parsing from string a millisec current time
		//System.out.println(beginning);//Tue Jun 24 22:11:57 IDT 2014
		//--------------------------------------------------------------------------
		Date_Kalendar();
		//--------------------------------------------------------------------------
		/*
	c.add(Calendar.YEAR,0);// talking calendar howayear,setup: 0++ year up , 0-- year down				
	System.out.println(sf.format(c.getTime()));// date format for printing in console, and for compere witch method equal

	c.setTime(date);// talking calendar nowadays
	System.out.println(sf.format(c.getTime()));// date format for printing in console, and for compere witch method equal

	int age = getAgeFromDate(date);//call a generic method that returns the integer as age, and receiving object type date
	System.out.println(age);// print result

	int age2 = getAge();  //method call that returns the age as integer, and works only with fields of a class where he is
	System.out.println(age2);// print result


	datebase db = null;
	List<Personinfo> li = db.getPersonYougerThan(44);
	for(Personinfo p:li)
		System.out.println(p);
		 */
		//------------------------------------------------------------------------
	}

	public static void Date_Kalendar(){
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");
		String dfs=df.format(d);
		//Date anDate=df.parse("25/12/23/22:45");
		System.out.println(d);
		//System.out.println(dfs);
		//System.out.println(anDate);
		System.out.println();
		Date d1=AfterDate(d,25);
		Date d2=AfterWeeks(d,12);
		Date d3=BeforMounce(d,-45);
		System.out.println(df.format(d1));
		System.out.println(df.format(d2));
		System.out.println(df.format(d3));
	}

	private static Date AfterWeeks(Date d, int amount) {
		GregorianCalendar gr=new GregorianCalendar();
		gr.setTime(d);
		gr.add(Calendar.DAY_OF_WEEK, amount);
		return gr.getTime();
	}

	private static Date BeforMounce(Date d, int amount) {
		GregorianCalendar gr=new GregorianCalendar();
		gr.setTime(d);
		gr.add(Calendar.DAY_OF_MONTH, amount);
		return gr.getTime();
	}

	private static Date AfterDate(Date d, int amount) {
		GregorianCalendar gr=new  GregorianCalendar();
		gr.setTime(d);
		gr.add(Calendar.DAY_OF_WEEK_IN_MONTH, amount);
		return gr.getTime();
	}

	public static class dateToInteger {
		// field of this class
		private static long inputdate = System.currentTimeMillis();// our field of this class
		private static Date birchday = new Date(inputdate/2);// our field of this class
		private static Date date = new Date(inputdate/3);//created object date witch parameter of current time and date
		private static Calendar c = new GregorianCalendar();//created callendar (gregorian)
		private static SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");//creat conteiner 


		public static int getAgeFromDate(Date date) {
			Calendar current = new GregorianCalendar();
			Calendar data = new GregorianCalendar();
			data.setTime(date);
			return current.get(Calendar.YEAR)-data.get(Calendar.YEAR);
		}

		public static int getAge(){
			GregorianCalendar date = new GregorianCalendar();
			GregorianCalendar current = new GregorianCalendar();	
			date.setTime(birchday);
			int age = current.get(Calendar.YEAR)-date.get(Calendar.YEAR);
			return 	age;		 
		}

		public class datebase{
			private Set<Personinfo> db;
			public datebase(int i){
				this.db = new TreeSet<Personinfo>();
				Personinfo[] prs = new Personinfo[5];
				c.add(Calendar.YEAR, 3);
				prs[0].birchday = c.getTime();
				c.add(Calendar.YEAR, 7);
				prs[1].birchday = c.getTime();
				c.add(Calendar.YEAR, 1);
				prs[2].birchday = c.getTime();
				c.add(Calendar.YEAR, 9);
				prs[3].birchday = c.getTime();
				c.add(Calendar.YEAR, 12);
				prs[4].birchday = c.getTime();
			}
			void add(Personinfo pi){
				db.add(pi);
			}
			public List<Personinfo> getPersonYougerThan(int age) {
				List<Personinfo> temp = new ArrayList<Personinfo>();
				for(Personinfo p: db){		
					int res = p.getAge();
					if(age < res){
						temp.add(p);	
					}
				}	
				return temp;
			}
		}
		public class Personinfo{
			private Date birchday;// our field of this class
			public Personinfo(){}	
			public int getAge(){	
				GregorianCalendar date = new GregorianCalendar();
				GregorianCalendar current = new GregorianCalendar();	
				date.setTime(birchday);
				int age = current.get(Calendar.YEAR)-date.get(Calendar.YEAR);
				return 	age;		 
			}
		}
	}



}
