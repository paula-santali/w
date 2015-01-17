package paula.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonInfo implements Comparable<PersonInfo> {
	private int id;
	private String name;
	private Date birthday;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + " ." + name + " .Birthday "
				+ new SimpleDateFormat("dd/MM/yyyy").format(birthday) +", ADDRESS:" + address ;
	}
	
	
	public PersonInfo(){
		
	}
	public PersonInfo(int id, String name, Date birthday, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	@Override
	public int compareTo(PersonInfo arg0) {
		
		return id-arg0.id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonInfo other = (PersonInfo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getAge(){
		/**primu calendar se subintelege timpul actual
		 * al doilea calendar se foloseste ca sa scoatem din
		 *  timpul actual anul nasterii ca sa optinem ani */	
		
		GregorianCalendar current= new GregorianCalendar();
		GregorianCalendar bDay=new GregorianCalendar();
		bDay.setTime(birthday);		
		return current.get(Calendar.YEAR) - bDay.get(Calendar.YEAR);
		
	}

}
