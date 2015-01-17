package paula_shop.controller;

import paula_shop.model.Productitem;
import paula_shop.model.Shop;
import paula_shop.model.ShopArray;
import paula_shop.view.ShopView;
import paula_shop.view.ShopViewConsole;

public class ShopTestAppl {

	
	private static final int I_TEMS = 5;
	private static final int I_ITEMS = 100000;
	private static final int N_REQUESTS = 1000;
	private static final int REQUEST_CODE = 80;
	private static final int REQUESTS_NAME = 20;

	public static void main(String[] args) {
		Shop shop= new ShopArray();
		ShopView view =new ShopViewConsole();
		Productitem[] item= new Productitem[I_TEMS];
		
		
		item[0]=new Productitem(30,"ice cream",166);
		
		item[1]=new Productitem(25,"they",188);
		
		item[2]=new Productitem(31,"ice cream",177);
		
		item[3]=new Productitem(22,"water",199);
		
		item[4]=new Productitem(24,"ice cream",200);
	ShopFunctionalTest test1=new ShopFunctionalTest(shop,view,item);
		test1.run();
		
	ShopPerformenceTest test2=new ShopPerformenceTest(shop,view,I_ITEMS,N_REQUESTS,REQUEST_CODE,
			REQUESTS_NAME);

	test2.run();
	System.out.println("\nThe ellapsed time is:");
	System.out.println(test2.getTime());
}

	
}