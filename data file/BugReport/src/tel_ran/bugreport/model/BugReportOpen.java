package tel_ran.bugreport.model;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class BugReportOpen {
    private String testerName;
    private String title;
    private Date openDate;
    private byte severeness;
    
    public static final byte COSMETIC=0;
    public static final byte MINOR=1;
    public static final byte CRITICAL=2;
    public BugReportOpen(String testerName){
        this.testerName=testerName;
        openDate=new Date();
    }
    public BugReportOpen(String testerName, Date openDate){
        this.testerName=testerName;
        this.openDate=openDate;
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
    public String getTesterName() {
        return testerName;
    }
    public Date getOpenDate() {
        return openDate;
    }
	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		return "BugReportOpen [testerName=" + testerName + ", title=" + title
				+ ", openDate=" + df.format(openDate) + ", severeness="
				+ severeness + "]";
	}
   

   
}

