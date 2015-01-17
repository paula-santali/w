package paula_garage.model;

public interface Garage {
	public Car[] getCars();
	public Car[] getCarsYear(int year);
	public Car[] getCarsVender(String vender);
	public Car[]getCarsVolume(int volume);
	public  void addCar(Car car);
	

}
