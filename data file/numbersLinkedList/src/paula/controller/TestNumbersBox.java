package paula.controller;

import paula.model.NumbersBox;
import paula.model.NumbersBoxLinked;

public class TestNumbersBox {

	
	public static void main(String[] args) {
		 int []array={5,5,5,-10,5,5,5,5,5,5,5,5,5,5};
	        NumbersBox nb=new NumbersBoxLinked(array);
	        nb.removeNumber(-10);
	        
	        
	         
	      //  nb.addNumbers(10);
	      // for(int number: nb)
	        //   System.out.print(number+" ");
	        //NumbersBox res=nb.getNumbersByComparator(new ComparatorLess(), 0);
	       // for(int number: res)
	       //     System.out.println(number);
	        //nb.removeRepeated();
	       // for(int number: nb)
	        //    System.out.println(number);
	    }

	}


