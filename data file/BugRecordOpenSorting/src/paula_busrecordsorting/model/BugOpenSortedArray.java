package paula_busrecordsorting.model;

import java.util.Arrays;
import java.util.Date;

public class BugOpenSortedArray implements BugOpenModel {
	private BugRecordOpen[]bugs;
	private DateComparator date_comparator;
	public BugOpenSortedArray(){
		bugs=new BugRecordOpen[0];
		date_comparator=new DateComparator();
	
	
	}
	@Override
	public boolean addRecord(BugRecordOpen bug) {
		BugRecordOpen adBugs[]=new BugRecordOpen[bugs.length+1];
		//index designates the place where the bug should be per sorted by the dates
		int index=Arrays.binarySearch(bugs, bug,date_comparator);
		if(index<0) //no bug opened at the same date
			index=-index-1;//new bug should be there
		System.arraycopy(bugs, 0, adBugs, 0, index);//bugs before index are copied
		adBugs[index]=bug;
		System.arraycopy(bugs, index, adBugs, index+1, bugs.length-index);//bugs from index up to end are copied
		bugs=adBugs;//bugs should refer the adBugs
		return true;//adding successful
	
	}
	@Override
	public BugRecordOpen[] getRecords() {
		return Arrays.copyOf(bugs, bugs.length);//returning bugs copy
		
	}
	@Override
	public BugRecordOpen[] getRecordsBefore(Date date) {
		int indexBefore=0;//index of the first bug after or equal the given
		BugRecordOpen pattern=new BugRecordOpen(date);
		indexBefore = getIndexBefore(date, pattern);
		
		return Arrays.copyOf(bugs, indexBefore);
	
	}
	private int getIndexBefore(Date date, BugRecordOpen pattern) {
		int indexBefore;
		indexBefore=Arrays.binarySearch(bugs, pattern, date_comparator);
		if(indexBefore < 0)
			//in the case the bugs with the given data don't exist 
			indexBefore=-indexBefore-1; //first after the given date
		else {
			//looking for first bug with date before the given date
			while(indexBefore>=0 && bugs[indexBefore].getOpenDate().equals(date))
				indexBefore--;
			indexBefore=indexBefore+1;//first equaled to the specified
		}
		return indexBefore;
		
	}
	@Override
	public BugRecordOpen[] getRecordsAfter(Date date) {
		int index=0;//index designating bug with the pointed date
		BugRecordOpen pattern=new BugRecordOpen(date);
		index = getIndexAfter(date, pattern);
		
		return Arrays.copyOfRange(bugs, index, bugs.length);
		
	}
	private int getIndexAfter(Date date, BugRecordOpen pattern) {
		int index;
		index=Arrays.binarySearch(bugs, pattern, date_comparator);
		if(index < 0)
			//in the case the bugs with the given data don't exist 
			index=-index-1; //first index of the bugs with date after the given date
		else {
			//looking for first bug with date after the given date
			while(index<bugs.length && bugs[index].getOpenDate().equals(date))
				index++;
		}
		return index;
		
	}

	
		
	
	
}