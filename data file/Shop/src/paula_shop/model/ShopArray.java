package paula_shop.model;

import java.util.Arrays;
import java.util.Iterator;

public class ShopArray implements Shop {
 private Productitem[]items= new Productitem[0];
 
 public ShopArray(){
	 
 }
 
 private ShopArray(Productitem[]items){
	 this.items=items;
	
 }

	@Override
	public Productitem getitemByCode(int code) {
		Productitem pattern = new Productitem(code,null,0);
		int index = Arrays.binarySearch(items,pattern);
	
		if(index<0)
			return null;
		return items[index];
	}

	@Override
	public Shop getitemsByName(String name) {
		Productitem[]result=new Productitem[items.length];
		int indResult=0;
		for(int i=0;i<items.length;i++)
			if(items[i].getName().equals(name))
				result[indResult++]=items[i];
		return new ShopArray(result);
		
	}

	@Override
	public Iterator<Productitem> iterator() {
		ShopArrayIterator p_iterator= new ShopArrayIterator(items);
		return p_iterator;
	}

	@Override
	public boolean addProductitem(Productitem pi) {
		Productitem[] newItems=new Productitem[items.length+1];		
		int index=Arrays.binarySearch(items,pi);
		if(index<0)
			index=-index-1;
		System.arraycopy(items,0,newItems,0,index);
		newItems[index]=pi;
		System.arraycopy(items,index,newItems,index+1,items.length-index);
		items=newItems;
		
		return true;
	}

}
