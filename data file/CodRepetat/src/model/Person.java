package model;
public class Person {
	private int id;
	private String name;
	private int birthYear;

	public Person(int id, String name, int birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthDay=" + birthYear
				+ "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	private void setId(int id) {
		this.id = id;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setBirthDay(int birthYear) {
		this.birthYear = birthYear;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
