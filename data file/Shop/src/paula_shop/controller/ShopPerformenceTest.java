package paula_shop.controller;

import paula_shop.model.Productitem;
import paula_shop.model.Shop;
import paula_shop.view.ShopView;

public class ShopPerformenceTest implements ShopTest{
 private static final int BYCODE = 10;
private static final String NAME = "name";
private Shop shop;
 private ShopView view;
 private int nitems;
 private int nRequests;
 private int nRequestsByCode;
 private int nRequestsByName;
 long runTime;
public ShopPerformenceTest(Shop shop, ShopView view, int nitems, int nRequests,
		int nRequestsByCode, int nRequestsByName) {
	super();
	this.shop = shop;
	this.view = view;
	this.nitems = nitems;
	this.nRequests = nRequests;
	this.nRequestsByCode = nRequestsByCode;
	this.nRequestsByName = nRequestsByName;
}
 
 
 public long getTime(){
	return runTime; 
 }


@Override
public void run() {
	Productitem[]items =new Productitem[nitems];
	for(int i=0;i<nitems;i++)
		items[i]=createRandItem();
	long time1=System.currentTimeMillis();
	
	for(int i=0;i<nitems;i++)
		shop.addProductitem(items[i]);
	 int amount;
	 amount=nRequests*nRequestsByCode/100;
	 for(int i=0;i<amount;i++)
		 shop.getitemByCode(BYCODE);
	 
	 amount=nRequests*nRequestsByName/100;
	 for(int i=0;i<amount;i++)
		 shop.getitemsByName(NAME);
	 
	 long time2=System.currentTimeMillis();
	 
	 runTime=(time2-time1);
	
	
}


private Productitem createRandItem() {
	int barCode=(int) (Math.random()*10);
	String name="Name"+(int)(Math.random()*20);
	int price=(int) (Math.random()*100);
	
	return new Productitem(barCode,name,price);
	
}
 
}
