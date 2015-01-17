package paula_bugsearching.controller;
import java.util.Comparator;

import paula_bugsearching.model.BugReportOppen;
 

public class TesterComparator implements Comparator<BugReportOppen>{ 
 
    @Override
    public int compare(BugReportOppen arg0, BugReportOppen arg1) {
         
        return arg0.getTesterName().compareTo(arg1.getTesterName());
}

}
