package interfaces;

import java.util.Date;

import paula_bugrecord.model.BugRecordOpen;

public interface BugOpenModel {

	public boolean addRecord(BugRecordOpen bug);
	public BugRecordOpen[] getRecords();
	public BugRecordOpen[] getRecordsBefore(Date date);
	public BugRecordOpen[] getRecordsAfter(Date date);
	
	}




