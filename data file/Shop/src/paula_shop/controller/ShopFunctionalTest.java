package paula_shop.controller;

import paula_shop.model.Productitem;
import paula_shop.model.Shop;
import paula_shop.view.ShopView;

public class ShopFunctionalTest implements ShopTest {
	
private Shop shop;
private ShopView view;
public ShopFunctionalTest(Shop shop, ShopView view,Productitem[]item) {
	super();
	this.shop = shop;
	this.view = view;
	for(int i=0;i<item.length;i++)
		shop.addProductitem(item[i]);
}
@Override
public void run() {
	view.setShop(shop);
	view.showShop("items");
	
	Shop NameShop=shop.getitemsByName("ice cream");
	view.setShop(NameShop);
	view.showShop("productitem ByName:");
	
	
	Productitem BYCode=shop.getitemByCode(22);
	System.out.println("\nproductitem ByCode:");
	view.showProduct(BYCode);
	
}


}
