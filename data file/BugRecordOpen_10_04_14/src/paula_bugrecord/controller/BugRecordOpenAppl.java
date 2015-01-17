package paula_bugrecord.controller;

import interfaces.BugOpenModel;
import interfaces.BugOpenView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import paula_bugrecord.model.BugOpenArrayModel;
import paula_bugrecord.model.BugRecordOpen;
import paula_bugrecord.view.BugOpenConsole;

public class BugRecordOpenAppl {
	
	private static final int N_TESTERS = 5;
	private static Random gen=new Random();
	private static final int N_RECORDS = 7;

	public static void main(String[] args) throws Exception {

		BugOpenModel bugs=new BugOpenArrayModel();
		BugRecordOpen records[]=new BugRecordOpen[N_RECORDS];
		fillRecords(records);
		createModel(bugs,records);

		BugOpenView view= new BugOpenConsole();
		view.setBugOpenModel(bugs);
		view.showBugRecords("\nBugs \n");

		/*SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy");
		Date date=df.parse("10/04/14");

		BugRecordOpen beforeBugs[]=bugs.getRecordsBefore(date);
		BugOpenModel bugsBefore=new BugOpenArrayModel();
		createModel(bugsBefore,beforeBugs);
		view.setBugOpenModel(bugsBefore);
		view.showBugRecords("\nBugs Before Days \n");

		BugRecordOpen afterBugs[]=bugs.getRecordsAfter(date);
		BugOpenModel bugsAfter=new BugOpenArrayModel();
		createModel(bugsAfter,afterBugs);
		view.setBugOpenModel(bugsAfter);
		view.showBugRecords("\nBugs After Days \n");*/

	}

	private static void fillRecords(BugRecordOpen[] records) {
		if(records != null){
			for(int i=0; i<records.length; i++){
				records[i]=createRandBug();
			}
		}

	}

	private static BugRecordOpen createRandBug() {
		String testerName="tester"+gen.nextInt(N_TESTERS);
		Date date=getRandDate();
		byte severeness=getRandSevereness();
		String title="Description"+gen.nextInt(N_RECORDS);
		BugRecordOpen bug=new BugRecordOpen(date);
		bug.setSevereness(severeness);
		bug.setDescription(title);
		bug.setTesterName(testerName);
		return bug;
	}
	private static byte getRandSevereness() {
		int number=gen.nextInt(3);
		byte result=0;
		switch(number){
		case 0: result=BugRecordOpen.COSMETIC; break;
		case 1: result=BugRecordOpen.MINOR; break;
		case 2: result=BugRecordOpen.MAJOR; break;
		case 3: result=BugRecordOpen.CRITICAL; break;
		}
		return result;	
	}
	private static Date getRandDate() {
		GregorianCalendar calendar=new GregorianCalendar(2014, 01, 01);
		calendar.set(Calendar.DAY_OF_YEAR, gen.nextInt(366));
		return calendar.getTime();
	}



	private static void createModel(BugOpenModel bugs, BugRecordOpen[] records) {		    	
		for(int i=0;i<records.length;i++){		    	
			bugs.addRecord(records[i]);


		}      
	}	 
}


