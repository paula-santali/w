package tel_ran.infotmation1;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import tel_ran.information.clas.BugReporteOpp;

public class BugReporteOpl {
	public  static final int N_BUGS=8;

	
	public static void main(String[] args) throws ParseException {
		 BugReporteOpp bugs[]=new BugReporteOpp[N_BUGS];
	        fillBugs(bugs);//array of bug reports has been filled
	        BugReporteOpp testerBugs[]=getBugsByTester(bugs, "tester1");
	        displayBugs(testerBugs);
	        
	        DateFormat df=new SimpleDateFormat("dd/MM/yy");
	        Date date= df.parse("12/03/14");
	        BugReporteOpp bugsBefore[]=getBugsBefore(bugs,date);
	        displayBugs(bugsBefore);
	    }
	 
	    private static BugReporteOpp[] getBugsBefore(BugReporteOpp[] bugs, Date date) {
	        
	        return null;
	    }
	 
	    private static void displayBugs(BugReporteOpp[] Bugs) {
	       for(int i=0;i<Bugs.length;i++){
	    	   System.out.println(Bugs[i]);
	       }  
	    }
	 
	    private static BugReporteOpp[] getBugsByTester(BugReporteOpp[] bugs,
	            String testerName) {
	        
	        return null;
	    }
	    private static void fillBugs(BugReporteOpp[] bugs) {
	       for(int i=0;i<bugs.length;i++){
	    	   bugs[i]=createBugs();
	       }
	}

		private static BugReporteOpp createBugs() {
		       Calendar calendar = new GregorianCalendar();
		       Random rand=new Random();
		       int year=2012+rand.nextInt(2);
		       int mounce=rand.nextInt(12);
		       int day=rand.nextInt(32);
		       String testername[]={"tester1","testerA","testerB","tester2","testerC","tester3"};
		       String Title[]={"title1","title2","title3","title4"};
		       calendar.set(year, mounce, day);
		       Date date=calendar.getTime();
		       int testName= rand.nextInt(testername.length);
		       int tit= rand.nextInt(Title.length);
		       byte str=(byte) rand.nextInt(3);
		       BugReporteOpp newRep=new BugReporteOpp(testername[testName],date);
			    newRep.setTitle(Title[tit]);
			    newRep.setSevereness(str);
		return newRep;
		}


}
