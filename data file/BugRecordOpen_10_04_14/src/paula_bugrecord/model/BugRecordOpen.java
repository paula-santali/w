package paula_bugrecord.model;
 
import java.util.Date;
 
public class BugRecordOpen {
private String testerName;
private byte Severeness;
private Date openDate;
private String description;
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
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
@Override
public String toString() {
    return "BugRecordOpen [testerName=" + testerName + ", Severeness="
            + Severeness + ", openDate=" + openDate + ", description="
            + description + "]";
}
public BugRecordOpen(){
    openDate=new Date();
}
public BugRecordOpen(Date date){
    openDate=date;
}
}

