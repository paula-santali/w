package models;
public class PersonComparator {
private int id;
private final String city;
private String adress;
private int birthYear;
private  int count;
public void setCount(int count) {
	this.count = count;
}
public PersonComparator(int id, String city, String adress, int birthYear) {
	this.id = id;
	this.city = city;
	this.adress = adress;
	this.birthYear = birthYear;
}
public int getId() {
	return id;
}
public String getCity() {
	return city;
}
public String getAdress() {
	return adress;
}
public int getBirthYear() {
	return birthYear;
}
@Override
public String toString() {
	return "Person [ id = " + id + ", city = " + city + ", adress = " +count+" "+ adress
			+ ", birthYear = " + birthYear + " ]";
}
}
