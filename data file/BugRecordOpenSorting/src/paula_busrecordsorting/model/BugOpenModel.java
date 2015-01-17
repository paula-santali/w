package paula_busrecordsorting.model;
import java.util.Date;

public interface BugOpenModel {
	public boolean addRecord(BugRecordOpen bug);
	public BugRecordOpen[] getRecords();
	public BugRecordOpen [] getRecordsBefore(Date date);
	public BugRecordOpen [] getRecordsAfter( Date date);
	
	

}
