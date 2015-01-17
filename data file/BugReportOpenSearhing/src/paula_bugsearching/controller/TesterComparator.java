package paula_bugsearching.controller;

import java.util.Comparator;

import paula_bugsearching.model.BugReportOpen;

public class TesterComparator implements Comparator< BugReportOpen> {

	@Override
	public int compare(BugReportOpen arg0, BugReportOpen arg1) {
		
		return arg0.getTesterName().compareTo(arg1.getTesterName());
	}

}
