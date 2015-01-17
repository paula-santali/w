package paula_bugrecordsotring.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import paula_bugrecordsorting.view.BugOpenConsole;
import paula_bugrecordsorting.view.BugOpenView;
//import paula_busrecordsorting.model.BugOpenArray;
import paula_busrecordsorting.model.BugOpenModel;
import paula_busrecordsorting.model.BugOpenSortedArray;
import paula_busrecordsorting.model.BugRecordOpen;

public class BugOpenAppl {

	private static final Random gen =new Random();
	private static final int N_RECORDS = 10;
	private static final int N_TESTERS = 5;

	public static void main(String[] args) throws ParseException {
		BugOpenModel bugs= new BugOpenSortedArray();
		BugRecordOpen[]records=new BugRecordOpen[N_RECORDS];
		fillRecords(records);
		createModel(bugs,records);
		
		
		BugOpenView view=new BugOpenConsole();
		view.setBugOpenModel(bugs);
		view.showBugRecords("\nBugs \n");
		
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy");
		Date date = df.parse("10/04/14");
		
		BugRecordOpen[] beforeBugs=bugs.getRecordsBefore(date);
		BugOpenModel bugsBefore=new BugOpenSortedArray();
		createModel( bugsBefore,beforeBugs);
		view.setBugOpenModel(bugsBefore);
		view.showBugRecords("\nBugs Before Days \n");
		
		BugRecordOpen[]afterBugs=bugs.getRecordsAfter(  date);
		BugOpenModel bugsAfter =new BugOpenSortedArray();
		createModel(bugsAfter,afterBugs);
		view.setBugOpenModel(bugsAfter);
		view.showBugRecords("\nBugs After Days \n");
	}
private static void fillRecords(BugRecordOpen[] records) {
	if(records!=null){
		for(int i=0;i<records.length;i++){
			records[i]=createRandBug();
		}		
		}	
	}

	private static BugRecordOpen createRandBug() {
		
		String testerName = "tester"+gen.nextInt(N_TESTERS);
		Date date = getRandDate();
		byte severeness=getRandSevereness();
		String title ="Description"+gen.nextInt(N_RECORDS);
		BugRecordOpen bug=new BugRecordOpen(date);
		bug.setSevereness(severeness);
		bug.setDesctription(title);
		bug.setTesterName(testerName);
		return bug;
	}
	private static byte getRandSevereness() {
		int number =gen.nextInt(3);
		byte result=0;
		switch(number){
		case 0: result= BugRecordOpen.COSMETIC;break;
		case 1: result= BugRecordOpen.MINOR;break;
		case 2: result= BugRecordOpen.MAJOR;break;
		case 3: result= BugRecordOpen.CRITICAL;break;
		
		}
		
		return result;
	}
	private static Date getRandDate() {
		GregorianCalendar calendar= new GregorianCalendar(2014,01,01);
		calendar.set(Calendar.DAY_OF_YEAR,gen.nextInt(366));
	return calendar.getTime();
		
	}
private static void createModel(BugOpenModel bugs, BugRecordOpen[] records) {
		for(int i=0;i<records.length;i++){
			bugs.addRecord(records[i]);
		}
	}


	
}
