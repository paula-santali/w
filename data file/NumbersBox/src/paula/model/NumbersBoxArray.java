package paula.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class NumbersBoxArray implements NumbersBox {

	private ArrayList<Integer> numbers;
    public NumbersBoxArray(){
        numbers=new ArrayList<Integer>();
    }
    public NumbersBoxArray(int [] numbers){
        this.numbers=new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
            this.numbers.add(numbers[i]);
    }
    @Override
    public Iterator<Integer> iterator() {
         
        return numbers.iterator();
    }
 
    @Override
    public void addNumber(int number) {
        numbers.add(number);
 
    }
 
    @Override
    public boolean removeNumber(int number) {
        Integer rnum=new Integer(number);
        return numbers.remove(rnum);
    }
 
    @Override
    public NumbersBox getNumbersByComparator(Comparator<Integer> comp,
            int patern) {
        NumbersBox res=new NumbersBoxArray();
        for(int number: numbers)
            if(comp.compare(number, patern)==0)
                res.addNumber(number);
        return res;
    }
 
    @Override
    public void removeRepeated() {//stergerea numerelor care se repeta
        Collections.sort(numbers);
        
        for(int i=0;i<numbers.size();i++){
        	int j=i+1;
        	int number=numbers.get(i);
        	//praverka na razmer
        	while(j<numbers.size()&&numbers.get(j)==number)
        		numbers.remove(j);
        }
 
    }
 
    @Override
    public void union(NumbersBox nb) {
    	for(int num:nb){
    		if(!numbers.contains(num))
    			numbers.add(num);
    	}
        
 
    }
 
    @Override
    public void intersection(NumbersBox nb) {
        for(int num:nb){
        	if(!numbers.contains(num))
        		numbers.remove(new Integer(num));
        }
 
    }
 
    @Override
    public void subtract(NumbersBox nb) {
    	for(int num:nb){
    		if(!numbers.contains(num))
    			numbers.remove(new Integer(num));
    	}
        
 
    }
 
}
