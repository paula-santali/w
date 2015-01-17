
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import tel_ran.bugreport.model.BugReportOpen;

public class BugReportAppl {

	private static final int N_BUGS = 100;
	private static final int N_TESTERS = 5;
	private static final int YEAR = 2014;
	private static Random gen=new Random();
	public static void main(String[] args) throws Exception {
		BugReportOpen bugs[]=new BugReportOpen[N_BUGS];
		fillBugs(bugs);//array of bug reports has been fiiled
		System.out.println("\nprinting bugs opened by tester1\n");
		BugReportOpen testerBugs[]=getBugsByTester(bugs, "tester1");
		displayBugs(testerBugs);
		System.out.println("\nprinting bugs opened before 12/3/14\n");
		DateFormat df=new SimpleDateFormat("dd/MM/yy");
		Date date= df.parse("12/03/14");
		BugReportOpen bugsBefore[]=getBugsBefore(bugs,date);
		displayBugs(bugsBefore);
		System.out.println("\nprinting bugs opened from 1/1/14 to 15/2/14\n");
		Date from=df.parse("1/1/14");
		Date to=df.parse("15/2/14");
		BugReportOpen bugsRange[]=getBugsInRangeDate(bugs,from,to);
		displayBugs(bugsRange);
	}
//functia care selecteaza toate bagurile intre un anumit interval de timp de la o date pina la alta
	private static BugReportOpen[] getBugsInRangeDate(BugReportOpen[] bugs,
			Date from, Date to) {
		BugReportOpen[] dateBugs=new BugReportOpen[bugs.length];
		int iResult=0;
		for(int i=0; i<bugs.length; i++){
			Date openDate=bugs[i].getOpenDate();
			if((openDate.after(from)||openDate.equals(from))&&openDate.before(to))
				dateBugs[iResult++]=bugs[i];
		}
		return Arrays.copyOf(dateBugs, iResult);
	}
//functia care seclecteaza toate bagurile care au fost inscrise dupa data care e data mai sus 
	private static BugReportOpen[] getBugsBefore(BugReportOpen[] bugs, Date date) {
		BugReportOpen[] dateBugs=new BugReportOpen[bugs.length];
		int iResult=0;
		for(int i=0; i<bugs.length; i++){
			Date openDate=bugs[i].getOpenDate();
			if(openDate.before(date))
				dateBugs[iResult++]=bugs[i];
		}
		return Arrays.copyOf(dateBugs, iResult);
	}
//functia care afisheaza la consoli toti bagii
	private static void displayBugs(BugReportOpen[] bugs) {
		for(int i=0; i<bugs.length; i++){
			System.out.println(bugs[i]);
		}
		
	}

	private static BugReportOpen[] getBugsByTester(BugReportOpen[] bugs,
			String testerName) {
		BugReportOpen[] testerBugs=new BugReportOpen[bugs.length];
		int iResult=0;
		for(int i=0; i<bugs.length; i++){
			String name=bugs[i].getTesterName();
			if(testerName.equals(name))
				testerBugs[iResult++]=bugs[i];
		}
		return Arrays.copyOf(testerBugs, iResult);
	}

	private static void fillBugs(BugReportOpen[] bugs) {
		if(bugs != null){
			for(int i=0; i<bugs.length; i++){
				bugs[i]=createRandBug();
			}
		}
	}

	private static BugReportOpen createRandBug() {
		String testerName="tester"+gen.nextInt(N_TESTERS);
		Date date=getRandDate();
		byte severeness=getRandSevereness();
		String title="title"+gen.nextInt(N_BUGS);
		BugReportOpen bug=new BugReportOpen(testerName, date);
		bug.setSevereness(severeness);
		bug.setTitle(title);
		return bug;
	}

	private static byte getRandSevereness() {
	int number=gen.nextInt(3);
	byte result=0;
		switch(number){
		case 0: result=BugReportOpen.COSMETIC; break;
	    case 1: result=BugReportOpen.MINOR; break;
		case 2: result=BugReportOpen.CRITICAL; break;
	}
	return result;	
	}
	private static Date getRandDate() {
		GregorianCalendar calendar=new GregorianCalendar(YEAR, 0, 1);
		calendar.set(Calendar.DAY_OF_YEAR, gen.nextInt(366));
		return calendar.getTime();
	}
}
