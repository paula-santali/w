package paula.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class NumbersBoxArray extends NumbersBoxList{

	  public NumbersBoxArray(){
	        numbers=new ArrayList<Integer>();
	    }
	    public NumbersBoxArray(int [] numbers){
	    	 // construirea numere de matrice a utilizatorului 
	    	 // numere - matrice utilizatorului 
	    	 // this.numbers - trimitere internă a obiectului ArrayLiat
	        this.numbers=new ArrayList<Integer>();
	        for(int i=0; i<numbers.length; i++)
	            this.numbers.add(numbers[i]);
	    }
	    @Override
	    public void removeRepeated() {
	        Collections.sort(numbers);//sortarea numerelor in ordine si cele care se repeta se afla unu dupa altu
	        for( int i=0; i<numbers.size(); i++){
	            int j=i+1;//urmatorul dupa i;
	            int number=numbers.get(i);
	            while(j<numbers.size() && numbers.get(j)==number)
	                numbers.remove(j); //stergerea numarului care se repeta
	            }		}
		
}
