package paula_garage.view;

import paula_garage.model.Car;
import paula_garage.model.Garage;


public class GarageConsoleView implements GarageView {
private Garage garage;

@Override
public void showGarage(String str) {
	System.out.println(str);
	Car[] CarsView=garage.getCars();
	for(int i=0;i<CarsView.length;i++)
		System.out.println(CarsView[i]);
	
}


	@Override
	public void setGarage(Garage garage) {
		this.garage=garage;
	}

	
}
