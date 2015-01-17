package paula_bugrecordsorting.view;

import paula_busrecordsorting.model.BugOpenModel;
import paula_busrecordsorting.model.BugRecordOpen;

public class BugOpenConsole implements BugOpenView {
public BugOpenModel model;

@Override
public void showBugRecords(String str) {
	System.out.println(str);
	BugRecordOpen[] bugs = model.getRecords();
	for(int i=0;i<bugs.length;i++)
		System.out.println(bugs[i]);

}
@Override
public void setBugOpenModel(BugOpenModel model) {
	this.model=model;
	
}

@Override
public BugOpenModel getBugOpenModel() {
	
	return model;
}


}
