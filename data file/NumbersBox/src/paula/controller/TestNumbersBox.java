package paula.controller;

import paula.model.NumbersBox;
import paula.model.NumbersBoxArray;
 
public class TestNumbersBox {
 
    public static void main(String[] args) {
        int []array={5,5,5,5,5,8,8,7,7,7};
        NumbersBox nb=new NumbersBoxArray(array);
        /*nb.removeNumber(-10);
         
        nb.addNumber(10);
        for(int number: nb)
            System.out.println(number);*/
        //NumbersBox res=nb.getNumbersByComparator(new ComparatorLess(), 0);
        //for(int number: res)
           // System.out.println(number);
        nb.removeRepeated();//strerge numerele care se repeta!
        for(int number: nb)
            System.out.print(number+ " ");
 
    }
 
}


