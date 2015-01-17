package paula.model;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class NumbersBoxList implements NumbersBox{
	protected List<Integer> numbers;
    
    
    @Override
    public Iterator<Integer> iterator() {
      
        return numbers.iterator();
    }
 
    public void addNumbers(int number) {
        //adaugam numar in ArrayList,sau in LinkedList
        numbers.add(number);
 
    }
 
    @Override
    public boolean removeNumber(int number) {
        //ca sa stergem un numar trebue sa fie Integer
        Integer rnum=new Integer(number);
        return numbers.remove(rnum);
    }
 
    @Override
    public NumbersBox getNumbersByComparator(Comparator<Integer> comp,
            int patern) {
        //obtinem numerele cu ajutorul commparatorului
         
        NumbersBox res = null;
        try {
            res = getClass().newInstance();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int number: numbers)
            if(comp.compare(number, patern)==0) //->conditia comparatorului
                res.addNumbers(number);
        return res;
    }
    @Override
    public abstract void removeRepeated() ;
 
    @Override
    public void union(NumbersBox nb) {
        for (int number: nb)
            if(!numbers.contains(number))
                numbers.add(number);//adauga numarul in cazul in carenu exista in "numere care le avem deja in colectie"
 
    }
 
    @Override
    public void intersection(NumbersBox nb) {
        List<Integer> tmp = null;
        try {
            tmp = numbers.getClass().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int number: nb)
            if(numbers.contains(number))
                tmp.add(number);
        numbers=tmp;
    }
 
    @Override
    public void subtract(NumbersBox nb) {
        for (int number: nb)
            if(numbers.contains(number))
                //se udalesk numerele care sunt si in colectie si in restul numerelor
                numbers.remove(new Integer(number));
 
    }
 
}



