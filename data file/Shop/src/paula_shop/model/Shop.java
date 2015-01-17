package paula_shop.model;

public interface Shop extends Iterable<Productitem>{
	public boolean addProductitem(Productitem pi);
	public Productitem getitemByCode(int code);
	public Shop getitemsByName(String name);

}
