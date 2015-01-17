package paula_bugsorting.controller;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import paula_bugsorting.model.BugReportOpen;

public class BugReportAppl {	
	private static final int N_BUGS = 5;
	private static final int N_TESTERS = 3;
	private static final int YEAR =2013;
	private static Random gen=new Random();
	public static void main(String[] args)  throws Exception{
		BugReportOpen[] bugs=new BugReportOpen[N_BUGS];
		fillBugs(bugs);
		Arrays.sort(bugs);
		displayBugs(bugs);
	}

	private static void displayBugs(BugReportOpen[] bugs) {
		for(int i=0;i<bugs.length;i++){
			System.out.println(bugs[i]);			
		}		
	}

	private static void fillBugs(BugReportOpen[] bugs) {
		if(bugs!=null){
			for(int i=0;i<bugs.length;i++){
				bugs[i]=createRandBugs();
			}
		}		
	}

	private static BugReportOpen createRandBugs() {
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


