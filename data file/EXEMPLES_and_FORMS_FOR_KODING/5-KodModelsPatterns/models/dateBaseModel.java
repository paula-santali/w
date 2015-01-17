package models;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class dateBaseModel{
	//----------------------------   INTERFACES    -----------------------------------------------------------------------
	public interface DB extends Iterable<Person>{// public interface DB 
		void addPerson(Person prs);
		List<Person> getPersonByid(int id);
		List<Person> getPersonByMyClass(int id);
		void removePersonByName(String name);
	}

	public interface PersonPresentation {	
		void showPerson(Person pi);
		void showPersons(Person[] pi);
		void showPersons();
	}

	//----------------------------------   MODEL   ----------------------------------------------------------------

	public class Person{
		private String name;
		private int id;
		MyClass myClass; 
		public Person(){}// default constr.
		public Person(String name, MyClass myClass) {   // class Person
			this.name = name;
			this.myClass = myClass;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public MyClass getMyClass() {
			return myClass;
		}
		public void setMyClass(MyClass myClass) {
			this.myClass = myClass;
		}
		@Override
		public String toString() {
			return "Person name=" + name + ", id=" + id + " ";
		}
	}

	public class MyClass{           // my class
		private String address;
		private int nBild;
		public MyClass(){} // default constr.
		public MyClass(String address, int nBild) {
			this.address = address;
			this.nBild = nBild;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getnBild() {
			return nBild;
		}

		@Override
		public String toString() {
			return " MyClass  address=" + address + ", nBild=" + nBild + " ";
		}

	}

	public class DateBase implements DB{    // date base class 
		private Map<Integer,Person>datebase;
		private int id = 0;
		@Override
		public Iterator<Person> iterator() {
			return datebase.values().iterator();
		}

		@Override
		public void addPerson(Person p) {
			// TODO Auto-generated method stub
		}
		@Override
		public void removePersonByName(String name) {
			// TODO Auto-generated method stub	
		}

		@Override
		public List<Person> getPersonByid(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public List<Person> getPersonByMyClass(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	//--------------------------------   VIEW (CONSOLE)     -----------------------------------------------------------------

	public class PresentConsole implements PersonPresentation {
		private DB datebase;

		public PresentConsole() {}// default constr.
		public PresentConsole(DB datebase) {
			if(!datebase.equals(null))			
				this.datebase = datebase;
		}
		@Override
		public void showPerson(Person p) {
			if(!p.equals(null))
				System.out.println(p);
		}
		@Override
		public void showPersons(Person[] p) {
			if(!p.equals(null)){
				for(int i=0;i<p.length;i++){
					System.out.println(p[i]);
				}
			}
		}
		@Override
		public void showPersons() {
			for(Person p: datebase)
				System.out.println(p);
		}
	}	

	//--------------------------------   CONTROLLER     -------------------------------------------------------------------
@SuppressWarnings("unused")
	public class functionalTest{
		
		private int nPerson;
		private Person prs;
		private MyClass mc;
		private DB datebase;

		public functionalTest(int nPerson, Person prs, MyClass mc, DB datebase) {
			this.nPerson = nPerson;
			this.prs = prs;
			this.mc = mc;
			this.datebase = datebase;
		}

		public void test(int nPersons){
			// TODO Auto-generated method stub	
		}

	}


	public static void main(String[] args) {

//		Person prs = new Person();
//		MyClass mc = new MyClass();
//		DB datebase = new DateBase();
//		functionalTest test = new functionalTest(25,prs,mc,datebase);

	}

}
