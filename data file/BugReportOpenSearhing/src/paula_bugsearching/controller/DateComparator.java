package paula_bugsearching.controller;

import java.util.Comparator;

import paula_bugsearching.model.BugReportOpen;

public class DateComparator implements Comparator< BugReportOpen> {

	@Override
	public int compare(BugReportOpen o1, BugReportOpen o2) {
		
		return o1.getOpenDate().compareTo(o2.getOpenDate());
	}

}
