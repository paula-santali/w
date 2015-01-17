package paula_shop.model;

import java.util.Iterator;

public class ShopArrayIterator implements Iterator<Productitem>{
private Productitem[]items;
 private int current=0;
 ShopArrayIterator(Productitem[]items){
	 this.items=items;
 }
	@Override
	public boolean hasNext() {
		boolean result=false;
		if(current<items.length&&items[current]!=null)
			result =true;
		return result;
	}

	@Override
	public Productitem next() {
	
		return items[current++];
	}

	@Override
	public void remove() {
		
		
	}

}
