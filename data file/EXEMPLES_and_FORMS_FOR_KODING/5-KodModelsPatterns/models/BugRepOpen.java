package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BugRepOpen implements Comparable<BugRepOpen> {
	private String testername;
	private String title;
	private  Date opendate;
	private byte severeness;
	private int count;	
	final public static byte COSMETIC=0;
	final public static byte MINOR=1;
	final public static byte CRITIC=2;
	public BugRepOpen(String testername){
		this.testername=testername;
		opendate=new Date();
	}
	public BugRepOpen(String testername, Date opendate){
		this.testername=testername;
		this.opendate=opendate;	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public byte getSevereness() {
		return severeness;
	}
	public void setSevereness(byte severeness) {
		this.severeness = severeness;
	}
	public String getTestername() {
		return testername;
	}
	public Date getOpendate() {
		return opendate;
	}
	public void setCount(int count){
		this.count=count;
	}	
	@Override
	public String toString() {
		String result = null;
		switch(severeness){
		case COSMETIC: result = "COSMETIC"; break;
		case MINOR: result = "MINOR"; break;
		case CRITIC: result = "CRITIC"; break;
		}
		return "Bug Report N-"+count+" Tester Name = " + testername + ", Title = " + title
		+ ", Open Date = " +new SimpleDateFormat("dd:MM:yyyy").format(opendate) + ", Severeness = " + result + " ]";
	}
	@Override
	public int compareTo(BugRepOpen o) {
		return opendate.compareTo(o.opendate);
	}
}

