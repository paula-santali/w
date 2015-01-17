package paula.model;

import java.util.Comparator;

public class ComparatorByAge implements Comparator< PersonInfo> {

	@Override
	public int compare(PersonInfo arg0, PersonInfo arg1) {
		// TODO Auto-generated method stub
		return arg0.getBirthday().compareTo(arg1.getBirthday());
	}

}
