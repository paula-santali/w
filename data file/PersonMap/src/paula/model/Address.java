package paula.model;

public class Address {
	private String country;
	private String city;
	private String street;
	private int nBld;
	private int nApp;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getnBld() {
		return nBld;
	}
	public void setnBld(int nBld) {
		this.nBld = nBld;
	}
	public int getnApp() {
		return nApp;
	}
	public void setnApp(int nApp) {
		this.nApp = nApp;
	}
	public Address(){
		
	}
	public Address(String country, String city, String street, int nBld, int nApp) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.nBld = nBld;
		this.nApp = nApp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + nBld;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (nBld != other.nBld)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " " + country + "  " + city + "  "
				+ street + ", nBld=" + nBld + ", nApp=" + nApp + "]";
	}

}
