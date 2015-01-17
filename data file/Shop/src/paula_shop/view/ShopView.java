package paula_shop.view;

import paula_shop.model.Productitem;
import paula_shop.model.Shop;

public interface ShopView {
	public void showShop(String str);
	public  void setShop(Shop shop);
	public  void showProduct(Productitem pi);

}
