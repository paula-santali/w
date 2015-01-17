package paula_busrecordsorting.model;

import java.util.Date;

public class BugRecordOpen {
	private String testerName;
	private byte Severeness;
	private Date openDate;
	private String desctription;
	
	public static final byte COSMETIC=0;
	public static final byte MINOR=1;
	public static final byte MAJOR=2;
	public static final byte CRITICAL=3;
	
	public String getTesterName() {
		return testerName;
	}
	public void setTesterName(String testerName) {
		this.testerName = testerName;
	}
	public byte getSevereness() {
		return Severeness;
	}
	public void setSevereness(byte severeness) {
		Severeness = severeness;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getDesctription() {
		return desctription;
	}
	public void setDesctription(String desctription) {
		this.desctription = desctription;
	}
	@Override
	public String toString() {
		return "BugRecordOpen [testerName=" + testerName + ", Severeness="
				+ Severeness + ", openDate=" + openDate + ", desctription="
				+ desctription + "]";
	}
	public BugRecordOpen(){
	    openDate=new Date();
	}
	public BugRecordOpen(Date date){
	    openDate=date;
	}
	
}
