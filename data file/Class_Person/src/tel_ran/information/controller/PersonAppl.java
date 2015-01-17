package tel_ran.information.controller;

import java.util.Random;

import tel_ran.information.classes.Person;

public class PersonAppl {

	
	public static void main(String[] args) {
		Person persons[]=new Person[8];
		fillPersons(persons);
		printPersons(persons);


	}
	private static void printPersons(Person[] persons) {
		for(int i=0;i<persons.length;i++){
			System.out.println(persons[i]);
		}
		
	}
	private static void fillPersons(Person[] persons) {
		for(int i=0;i<persons.length;i++){
			persons[i]=createPerson();
		}
		
	}
	private static Person createPerson(){
		String names[]={"Vasea","Yulia","Andrey","Fedya","Miri"};
		String addresses[]={"Tel-Aviv","Ranana","Rehovot","Ghedera"};
		Random rand=new Random();
		int iName=rand.nextInt(names.length);
		int iAddress=rand.nextInt(addresses.length);
		int id=(rand.nextInt(9)+1)*1000000+rand.nextInt(1000)*1000+rand.nextInt(1000);
		int age=rand.nextInt(100);
		Person person =new Person();
		person.setAddress(addresses[iAddress]);
		person.setAge(age);
		person.setId(id);
		person.setName(names[iName]);
		return person;
	}

}
