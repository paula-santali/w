package paula_garage.model;

public class Car implements Comparable<Car>{
	private String vender ;
	private int year;
	private int volume;
	public Car(String vender, int year, int volume) {
		super();
		this.vender = vender;
		this.year = year;
		this.volume = volume;
	}
	public String getVender() {
		return vender;
	}
	public int getYear() {
		return year;
	}
	public int getVolume() {
		return volume;
	}
	 void setVender(String vender) {
		this.vender = vender;
	}
	 void setYear(int year) {
		this.year = year;
	}
	 void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Car [vender=" + vender + ", year=" + year + ", volume="
				+ volume + "]";
	}
	@Override
	public int compareTo(Car arg0) {
		
		return year-arg0.year;
	}
	

}
