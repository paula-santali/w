package paula_garage.controller;

import paula_garage.model.Garage;
import paula_garage.model.GarageArray;

public class GarageAppl {
	 
    private static final int N_CARS = 100;
    private static final int N_REQUESTS = 1000000;
    private static final int N_YEAR_REQUESTS = 20;
    private static final int N_VENDER_REQUESTS = 40;
    private static final int N_VOLUME_REQUESTS = 40;
 
    public static void main(String[] args) {
        Garage garage=new GarageArray();
        GarageController controller=new GarageController(garage,
                N_CARS, N_REQUESTS, N_YEAR_REQUESTS, 
                N_VENDER_REQUESTS, N_VOLUME_REQUESTS);
        controller.run();
        System.out.println("Time of model running is "+controller.getRunTime());
 
    }
 

}
