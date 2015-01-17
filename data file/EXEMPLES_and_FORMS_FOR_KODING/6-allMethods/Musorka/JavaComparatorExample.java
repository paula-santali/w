package Musorka;

import java.util.Arrays;
import java.util.Comparator;
 
class Employee{
   
    private int age;    
    private String name;
   
    public void setAge(int age){
        this.age=age;    
    }
   
    public int getAge(){
        return this.age;    
    }
   
    public void setName(String name){
        this.name=name;    
    }
   
    public String getName(){    
        return this.name;    
    }
}
 
class AgeComparator implements Comparator<Object>{
   
    public int compare(Object emp1, Object emp2){
   
        /*
         * parameter are of type Object, so we have to downcast it
         * to Employee objects
         */
       
        int emp1Age = ((Employee)emp1).getAge();        
        int emp2Age = ((Employee)emp2).getAge();
       
        if(emp1Age > emp2Age)
            return 1;
        else if(emp1Age < emp2Age)
            return -1;
        else
            return 0;    
    }
   
}
 

class NameComparator implements Comparator<Object>{
 
    public int compare(Object emp1, Object emp2){    
 
        //parameter are of type Object, so we have to downcast it to Employee objects
       
        String emp1Name = ((Employee)emp1).getName();        
        String emp2Name = ((Employee)emp2).getName();
       
        //uses compareTo method of String class to compare names of the employee
        return emp1Name.compareTo(emp2Name);
   
    }
 
}

public class JavaComparatorExample{
   
    public static void main(String args[]){
       
        //Employee array which will hold employees
        Employee employee[] = new Employee[2];
       
        //set different attributes of the individual employee.
        employee[0] = new Employee();
        employee[0].setAge(40);
        employee[0].setName("Joe");
       
        employee[1] = new Employee();
        employee[1].setAge(20);
        employee[1].setName("Mark");
                 
        Arrays.sort(employee, new AgeComparator());
                      
        Arrays.sort(employee, new NameComparator());       
         
    } 
}
/*	Person prs = new Person(1290567," moshe", " daskvo",1957);
Person prs1 = new Person(12567," mvasye", " akvo",1967);
Person prs2 = new Person(123452367," mosrytuhe", " laso",1987);
Person[] arPerson = new Person[3];
arPerson[0] = prs;
arPerson[1] = prs1;
arPerson[2] = prs2;
Arrays.sort(arPerson);
for(int i=0;i<arPerson.length;i++)
	System.out.println(arPerson[i]);

		RandomFillArrays.fillArray(RandomFillArrays.array);
	  //Arrays.sort(RandomFillArrays.array);
		
		Arrays.sort(RandomFillArrays.array, new NameComparator());
		RandomFillArrays.displayBugs(RandomFillArrays.array); 		
		
		
//@Override
//public int compareTo(Person o) {
//	//return birthYear-o.birthYear;
//	//return adress.compareTo(o.adress);
//	return city.compareTo(o.city);
//	//return id-o.id;
//	//return count-o.count;
//}
 */
