package models;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class person_immutable {
	private static long currentId=0;
	private long id;
	private int age;
	private int birthYear;
	private String ferstName;
	private String lastName;

	public person_immutable(int age, int birthYear, String ferstName,String lastName) {
		GregorianCalendar cal=new GregorianCalendar();
		int year=cal.get(Calendar.YEAR);
		birthYear=year-age;
		id=currentId++;
		this.age = age;
		this.birthYear = birthYear;
		this.ferstName = ferstName;
		this.lastName = lastName;
	}
	public static long getCurrentId() {
		return currentId;
	}
	public long getId() {
		return id;
	}
	public int getAge() {
		GregorianCalendar cal=new GregorianCalendar();
		int year=cal.get(Calendar.YEAR);
		return year-birthYear;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public String getFerstName() {
		return ferstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age 
		+ ", ferstName=" + ferstName + ", lastName=" + lastName + "]";
	}



}
