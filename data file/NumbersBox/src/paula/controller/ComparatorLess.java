package paula.controller;

import java.util.Comparator;

public class ComparatorLess implements Comparator<Integer> {
	 
    public int compare(Integer arg0, Integer arg1) {
        int res=1;
        if(arg0<arg1)
            res=0;
        return res;
    }

}
