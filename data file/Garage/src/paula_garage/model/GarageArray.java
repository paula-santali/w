package paula_garage.model;

import java.util.Arrays;

public class GarageArray implements Garage{
 private Car[]cars;
 
 public GarageArray(){
	 cars=new Car[0];
 } 

 public GarageArray(Car[]cars){
		 this.cars=Arrays.copyOf(cars,cars.length);
		 Arrays.sort(this.cars);
				 
	 }
 
	@Override
	public Car[] getCars() {
		
		return Arrays.copyOf(cars,cars.length);
	}

	@Override
	public Car[] getCarsYear(int year) {
		Car pattern= new Car(null,year,0);
		int index=Arrays.binarySearch(cars,pattern);
		int indexStart,indexEnd;
		Car[]result=null;
		if(index<0)
			result=new Car[0];
		else
		{
			indexStart=indexEnd=index;
			while(indexStart>=0&&cars[indexStart].getYear()==year)indexStart--;
			while(indexEnd<cars.length&&cars[indexEnd].getYear()==year)indexEnd++;
			result=Arrays.copyOfRange(cars,indexStart+1,indexEnd);
		}
		
		return result;
	}

	@Override
	public Car[] getCarsVender(String vender) {
		Car[] venderCars = new Car[cars.length];
		int iResult=0;
		for(int i=0; i<cars.length; i++){
			if(cars[i].getVender().equals(vender)){
				venderCars[iResult++]=cars[i];
			}
		}
		return Arrays.copyOf(venderCars, iResult);
	}

	@Override
	public Car[] getCarsVolume(int volume) {
		Car[] volumeCars = new Car[cars.length];
		int iResult=0;
		for(int i=0; i<cars.length; i++){
			if(cars[i].getVolume()==volume){
				volumeCars[iResult++]=cars[i];
			}
		}
		return Arrays.copyOf(volumeCars,iResult);
	}

	@Override
	public void addCar(Car car) {
		Car[] carss=Arrays.copyOf(cars,cars.length+1);
		int index=Arrays.binarySearch(cars,car);
		int newIndex;
		if(index<0)
			newIndex=-index-1;
		else
		    newIndex=index;
		System.arraycopy(cars,0,carss,0,newIndex);
		carss[newIndex]=car;
		System.arraycopy(cars,newIndex,carss,newIndex+1,cars.length-newIndex);
		cars=carss;
		
	}
	
	//index=-2-1=-3 -> newIndex=-(-3)-1=2
	
	 //0  1    2   3    4   5
 //car[9][10] [12][13][13][15]
	//carss[9][10][];
}
