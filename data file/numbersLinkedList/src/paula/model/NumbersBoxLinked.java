package paula.model;

import java.util.Collections;
import java.util.LinkedList;

public class NumbersBoxLinked extends NumbersBoxList{

	public NumbersBoxLinked(){//constructor fara parametri 
		numbers=new LinkedList<Integer>();
	}
	public NumbersBoxLinked(int[]numbers){
		this.numbers=new LinkedList<Integer>();
		for(int i=0;i<numbers.length;i++){
			this.numbers.add(numbers[i]);
		}
		
	}
	
	@Override
	public void removeRepeated() {
		Collections.sort(numbers);
		for(int i=0;i<numbers.size();i++){
			int j=i+1;
		int number=numbers.get(i);
		while(j<numbers.size() && numbers.get(j)==number)
            numbers.remove(j); //stergerea numarului care se repeta
        }
	}
				
}


