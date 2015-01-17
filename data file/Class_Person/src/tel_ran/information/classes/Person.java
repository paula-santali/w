package tel_ran.information.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private long id;
	private int brithYear;
	private String name;
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		GregorianCalendar calendar =new GregorianCalendar();
		int age=calendar.get(Calendar.YEAR)-brithYear;
		return age;
	}
	public void setAge(int age) {
		GregorianCalendar calendar =new GregorianCalendar();
		int brithYear =calendar.get(Calendar.YEAR)-age;
		this.brithYear =brithYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ ", age=" + getAge() + "]";
	}
	
	}


