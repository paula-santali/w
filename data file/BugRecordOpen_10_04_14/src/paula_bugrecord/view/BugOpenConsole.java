package paula_bugrecord.view;

import interfaces.BugOpenModel;
import interfaces.BugOpenView;
import paula_bugrecord.model.BugRecordOpen;

public class BugOpenConsole implements BugOpenView {
	 private BugOpenModel model;
	    public void showBugRecords(String str) {
	    	System.out.println(str);
	        BugRecordOpen[] bugs=model.getRecords();
	        for(int i=0; i<bugs.length; i++)
	            System.out.println(bugs[i]);
	 
	    }
	 
	    public void setBugOpenModel(BugOpenModel model) {
	        this.model=model;
	 
	    }
	 
	    public BugOpenModel getBugOpenModel() {
	        return model;
	    }
	
}
