package tel_ran.bugs.controller;

 
import java.util.*;

import tel_ran.bugs.model.BugReportOpen;



public class BugReportAppl {

	private static final int N_BUGS = 40;
	private static final int N_TESTERS = 5;
	private static final int YEAR = 2014;
	private static final int days = 10;
	private static Random gen=new Random();
	
	public static void main(String[] args) throws Exception {
		BugReportOpen bugs[]=new BugReportOpen[N_BUGS];
		fillBugs(bugs);//array of bug reports has been fiiled
		displayBugs(bugs);
		
		System.out.println(" printing bugs remuve cosmetic \n");
		BugReportOpen[] rembugs=remuveCosmetic(bugs);
		displayBugs(rembugs);
	
		System.out.println("printing bugs CriticalMoreDays \n");
	BugReportOpen [] critbugs= getCriticalMoreDays( bugs,  days);
		displayBugs(critbugs);
		
	}
	private static BugReportOpen[] remuveCosmetic(BugReportOpen[] bugs) {
		BugReportOpen[] rembugs=new BugReportOpen[bugs.length];
		int iResult=0;
		for(int i=0;i<bugs.length;i++){
		String severeness=bugs[i].getSevereness();
		if(severeness.equals("Minor")||severeness.equals("Critical")){
			rembugs[iResult++]=bugs[i];
		}
		}
		return Arrays.copyOf(rembugs,iResult );
	}
	 private static BugReportOpen[] getCriticalMoreDays(BugReportOpen[] bugs,
	            int days) {
	        GregorianCalendar calendar=new GregorianCalendar();//current date
	        calendar.add(Calendar.DAY_OF_MONTH, -days);//date before specific days
	        Date date=calendar.getTime();
	        BugReportOpen[] dateBugs=new BugReportOpen[bugs.length];
	        int iResult=0;
	        for(int i=0; i<bugs.length; i++){
	            Date openDate=bugs[i].getOpenDate();
	            if(openDate.before(date)&& bugs[i].CRITICAL==BugReportOpen.CRITICAL)
	                dateBugs[iResult++]=bugs[i];
	        }
	        return Arrays.copyOf(dateBugs, iResult);
	    }

//	private static BugReportOpen[] getCriticalMoreDays(BugReportOpen[] bugs,int days){
//		BugReportOpen[] dateBugs=new BugReportOpen[bugs.length];
//		GregorianCalendar calendar=new GregorianCalendar();
//		calendar.add(Calendar.DAY_OF_MONTH,-days);
//		int iResult=0;
//		for(int i=0;i<bugs.length;i++){
//			 Date openDate=bugs[i].getOpenDate();
//	            if(openDate.before(date)&&bugs[i].getSevereness()==BugReportOpen.CRITICAL)
//	                dateBugs[iResult++]=bugs[i];
//
//			//String severeness=bugs[i].getSevereness();
//			//if(severeness.equals("Critical"))
//				//if(bugs[i].getOpenDate().before(calendar.getTime())){
//				
//			//critbugs[iResult++]=bugs[i];
//		
//		}
//		
//	return Arrays.copyOf(critbugs, iResult);
//	}
	
	private static void displayBugs(BugReportOpen[] bugs) {
		for(int i=0; i<bugs.length; i++){
			System.out.println(bugs[i]);
		}
		
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
 