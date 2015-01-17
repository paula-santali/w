package paula_garage.controller;

import paula_garage.model.Car;
import paula_garage.model.Garage;

public class GarageController {
	private static final int YEAR = 2014;
	private static final String VENDER = "zaparojets";
	private static final int VOLUME = 5000;
	private Garage garage;
	private Garage view;
	private int runTime;
	private int nCars;
	private int nRequests;
	private int nYearRequests;
	private int nVenderRequests;
	private int nVolumeRequests;
	
	public GarageController(Garage garage, int nCars, int nRequests,
			int nYarsRequests, int nVenderRequests, int nVolumeRequests) {
		super();
		this.garage = garage;
		this.nCars = nCars;
		this.nRequests = nRequests;
		this.nYearRequests = nYarsRequests;
		this.nVenderRequests = nVenderRequests;
		this.nVolumeRequests = nVolumeRequests;
	}
	public void run(){
	 Car[] cars=new Car[nCars];
		  for(int i=0;i<nCars;i++)
		   cars[i]=createRandCar();
		  long time1=System.currentTimeMillis();	  
	for(int i=0;i<nCars;i++)
		garage.addCar(cars[i]);
	int amount;
	amount=nRequests*nYearRequests/100;
	for(int i=0;i<amount;i++)
		garage.getCarsYear(YEAR);
	amount=nRequests*nVenderRequests/100;
	for(int i=0;i<amount;i++)
		garage.getCarsVender(VENDER);
	amount = nRequests*nVolumeRequests/100;
	for(int i=0;i<amount;i++)
		garage.getCarsVolume(VOLUME);
	    long time2=System.currentTimeMillis();
	runTime=(int) (time2-time1);
		
	}
  private Car createRandCar() {
 int year=2000+ (int)(Math.random()*15);
 String vender="vender"+(int) ((Math.random())*10);
 int volume= 1000+(int)(Math.random()*5000);
		return new Car(vender,year,volume);
	}
public int getRunTime(){
	return runTime;
	  
  }
}
