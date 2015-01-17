package paula_bugrecord.model;
	import interfaces.BugOpenModel;

import java.util.Arrays;
import java.util.Date;
	 
	public class BugOpenArrayModel implements BugOpenModel {
	    private BugRecordOpen [] bugRecords=new BugRecordOpen[0];
	    @Override
	    public boolean addRecord(BugRecordOpen bug) {
	        BugRecordOpen [] bugs=Arrays.copyOf(bugRecords, bugRecords.length+1);
	        bugs[bugRecords.length]=bug;
	        bugRecords=bugs;
	        return true;
	    }
	 
	    @Override
	    public BugRecordOpen[] getRecords() {
	       
	        return Arrays.copyOf(bugRecords, bugRecords.length);
	    }
	 //scoate toate bagutile cu inregistrari cates befor dupa data care noi am dato Date date
	    public BugRecordOpen[] getRecordsBefore(Date date) {
	        BugRecordOpen[] result=new BugRecordOpen[bugRecords.length];
	        int iResult=0;
	        for(int i=0; i<bugRecords.length; i++){
	            if(bugRecords[i].getOpenDate().before(date))
	                result[iResult++]=bugRecords[i];
	        }
	        return Arrays.copyOf(result, iResult);
	    }
	 
	    public BugRecordOpen[] getRecordsAfter(Date date) {
	        BugRecordOpen[] result=new BugRecordOpen[bugRecords.length];
	        int iResult=0;
	        for(int i=0; i<bugRecords.length; i++){
	            if(bugRecords[i].getOpenDate().after(date))
	                result[iResult++]=bugRecords[i];
	        }
	        return Arrays.copyOf(result, iResult);
	    }
	}