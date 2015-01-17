package paula_shop.view;

import paula_shop.model.Productitem;
import paula_shop.model.Shop;

public class ShopViewConsole implements ShopView{
  Shop shop;
	public void showShop(String string) {
		System.out.println("\n"+string+"\n");
	for(Productitem items:shop)
		System.out.println(items);
	}
	@Override
	public void setShop(Shop shop) {
		this.shop=shop;
		
	}
	@Override
	public void showProduct(Productitem pi) {
		System.out.println();
		System.out.println(pi);		
	}
}
