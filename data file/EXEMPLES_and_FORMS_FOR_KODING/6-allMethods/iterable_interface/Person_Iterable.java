package iterable_interface;
//Person.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Person_Iterable {

	static class Person implements Iterable<Person> {
		private String firstName;
		private String lastName;
		private int age;
		private List<Person> children = new ArrayList<Person>();

		public Person(Person... kids) {
			for (Person child : kids)
				children.add(child);
		}

		public String getFirstName(){
			return this.firstName; 
		}
		public String getLastName(){ 
			return this.lastName; 
		}
		public int getAge(){
			return this.age; 
		}

		public Iterator<Person> iterator() {
			return children.iterator();
		}
		public void setFirstName(String value){
			this.firstName = value;
		}
		public void setLastName(String value){
			this.lastName = value; 
		}
		public void setAge(int value) {
			this.age = value; 
		}
		public String toString() { 
			return "[Person: " +"firstName=" + firstName + " " +"lastName=" + lastName + " " + "age=" + age + "]";
		}
	}


}
