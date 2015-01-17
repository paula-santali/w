package paula_bugsearching.controller;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
 
import paula_bugsearching.model.BugReportOppen;
 
public class BugReportAppl {
		    private static final int N_BUGS = 20;
		    private static final int N_TESTERS = 5;
		    private static final int YEAR = 2014;
		    private static Random gen=new Random();


			public static void main(String[] args) throws Exception {
		        BugReportOppen bugs[]=new BugReportOppen[N_BUGS];
		        fillBugs(bugs);//array of bug reports has been filled
		        //array sorted by tester name
		        BugReportOppen testerBugs[]=Arrays.copyOf(bugs,bugs.length);
		        //array sorted by date
		        BugReportOppen dateBugs[]=Arrays.copyOf(bugs,bugs.length);
		        //Sorting
		        Arrays.sort(testerBugs, new TesterComparator());
		        System.out.println("Printing bugs sorted by tester name");
		        displayBugs(testerBugs);
		        Arrays.sort(dateBugs);
		        System.out.println("\nPrinting bugs sorted by date");
		        displayBugs(dateBugs);
		        
		        //printing bugs opened before 10/3/14
		        System.out.println("printing bugs opened before 10/3/14");
		        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy");
		        Date date=df.parse("10/03/14");
		        BugReportOppen bugs1[]=getBugsBeforeDate(dateBugs,date);
		        displayBugs(bugs1);
		        
		        //printing bugs opened after 10/3/14
		        System.out.println("printing bugs opened after 10/3/14");
		         bugs1=getBugsAfterDate(dateBugs,date);
		        displayBugs(bugs1);
		        
		        //printing bugs opened in range from 10/3/14 to 15/7/14
		        System.out.println("printing bugs opened in range from 10/3/14 to 15/7/14");
		        Date date1=df.parse("15/07/14");
		        bugs1=getBugsInRange(dateBugs,date,date1);
		        displayBugs(bugs1);
		        
		        //printing bugs opened by tester1
		        System.out.println("printing bugs opened by tester1");
		        bugs1=getBugsByTester(testerBugs,"tester1");
		        displayBugs(bugs1);
		    }
		 

		    private static BugReportOppen[] getBugsByTester(BugReportOppen[] testerBugs,
		            String tester) {
		        int indexFirst=0; //index first bug opened by the tester
		        int indexLast=0; //index first bug after the last one opened by the tester
		        BugReportOppen pattern=new BugReportOppen(tester, null);
		        BugReportOppen[] result=null;
		        indexFirst=Arrays.binarySearch(testerBugs, pattern, new TesterComparator());
		        indexLast=indexFirst+1;
		        if(indexFirst<0)
		            result=new BugReportOppen[0];//creation of empty array
		        else {
		            while (indexFirst>=0 && testerBugs[indexFirst].getTesterName().equals(tester))
		                indexFirst--;
		            indexFirst=indexFirst+1;
		            while(indexLast<testerBugs.length && testerBugs[indexLast].getTesterName().equals(tester))
		                indexLast++;
		             
		            result=Arrays.copyOfRange(testerBugs, indexFirst, indexLast);
		        }
		        return result;
		    }
		 
		 
		    private static BugReportOppen[] getBugsInRange(BugReportOppen[] dateBugs,
		            Date from, Date to) {
		        int indexFrom=0; //index of the first bug with date after the 'from' 
		        int indexBefore=0; //index of the first bug with date equaled or after the 'to'
		        BugReportOppen patternFrom=new BugReportOppen(null,from);
		        BugReportOppen patternBefore=new BugReportOppen(null,to);
		        indexFrom = getIndexFrom(dateBugs,from, patternFrom);
		        indexBefore = getIndexBefore(dateBugs, to, patternBefore);
		        return Arrays.copyOfRange(dateBugs, indexFrom, indexBefore);
		    }
		 
		    private static int getIndexFrom(BugReportOppen[] dateBugs, Date from,
		            BugReportOppen patternFrom) {
		        int indexFrom=0; //index of first bug equal or after the 'from'
		        indexFrom=Arrays.binarySearch(dateBugs, patternFrom);
		        if(indexFrom < 0)
		            indexFrom=-indexFrom-1;
		        else {
		            while(indexFrom>=0 && dateBugs[indexFrom].getOpenDate().equals(from))
		                indexFrom--;
		            indexFrom=indexFrom+1;
		        }
		        return indexFrom;
		    }
		 
		 
		    private static BugReportOppen[] getBugsAfterDate(BugReportOppen[] dateBugs,
		            Date date) {
		        int index=0;//index designating bug with the pointed date
		        BugReportOppen pattern=new BugReportOppen(null,date);
		        index = getIndexAfter(dateBugs, date, pattern);
		         
		        return Arrays.copyOfRange(dateBugs, index, dateBugs.length);
		    }
		 
		 
		    private static int getIndexAfter(BugReportOppen[] dateBugs, Date date,
		            BugReportOppen pattern) {
		        int index;
		        index=Arrays.binarySearch(dateBugs, pattern);
		        if(index < 0)
		            //in the case the bugs with the given data don't exist 
		            index=-index-1; //first index of the bugs with date after the given date
		        else {
		            //looking for first bug with date after the given date
		            while(index<dateBugs.length && dateBugs[index].getOpenDate().equals(date))
		                index++;
		        }
		        return index;
		    }
		 
		    private static BugReportOppen[] getBugsBeforeDate(BugReportOppen[] dateBugs,
		            Date date) {
		        int indexBefore=0;//index of the first bug after or equal the given
		        BugReportOppen pattern=new BugReportOppen(null,date);
		        indexBefore = getIndexBefore(dateBugs, date, pattern);
		         
		        return Arrays.copyOf(dateBugs, indexBefore);
		    }
		 
		
		    private static int getIndexBefore(BugReportOppen[] dateBugs, Date date,
		            BugReportOppen pattern) {
		        int indexBefore;
		        indexBefore=Arrays.binarySearch(dateBugs, pattern);
		        if(indexBefore < 0)
		            //in the case the bugs with the given data don't exist 
		            indexBefore=-indexBefore-1; //first after the given date
		        else {
		            //looking for first bug with date before the given date
		            while(indexBefore>=0 && dateBugs[indexBefore].getOpenDate().equals(date))
		                indexBefore--;
		            indexBefore=indexBefore+1;//first equaled to the specified
		        }
		        return indexBefore;
		    }
		 
		 
		    private static void displayBugs(BugReportOppen[] bugs) {
		        for(int i=0; i<bugs.length; i++){
		            System.out.println(bugs[i]);
		        }
		         
		    }
		 
		    private static void fillBugs(BugReportOppen[] bugs) {
		        if(bugs != null){
		            for(int i=0; i<bugs.length; i++){
		                bugs[i]=createRandBug();
		            }
		        }
		         
		    }
		 
		    private static BugReportOppen createRandBug() {
		        String testerName="tester"+gen.nextInt(N_TESTERS);
		        Date date=getRandDate();
		        byte severeness=getRandSevereness();
		        String title="title"+gen.nextInt(N_BUGS);
		        BugReportOppen bug=new BugReportOppen(testerName, date);
		        bug.setSevereness(severeness);
		        bug.setTitle(title);
		        return bug;
		    }
		 
		    private static byte getRandSevereness() {
		        int number=gen.nextInt(3);
		        byte result=0;
		        switch(number){
		        case 0: result=BugReportOppen.COSMETIC; break;
		        case 1: result=BugReportOppen.MINOR; break;
		        case 2: result=BugReportOppen.CRITICAL; break;
		        }
		        return result;
		    }
		 
		    private static Date getRandDate() {
		        GregorianCalendar calendar=new GregorianCalendar(YEAR, 0, 1);
		        calendar.set(Calendar.DAY_OF_YEAR, gen.nextInt(366));
		        return calendar.getTime();
		    }
		
	}


