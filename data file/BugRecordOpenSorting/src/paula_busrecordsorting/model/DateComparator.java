package paula_busrecordsorting.model;

import java.util.Comparator;

public class DateComparator implements Comparator< BugRecordOpen> {

	@Override
	public int compare(BugRecordOpen arg0, BugRecordOpen arg1) {
		
		return arg0.getOpenDate().compareTo(arg1.getOpenDate());
	}

}
