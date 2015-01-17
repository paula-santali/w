package paula_shop.model;

public class Productitem implements Comparable<Productitem> {
	private int barCode;
	private String name;
	private int price;
	public Productitem(int barCode, String name, int price) {
		super();
		this.barCode = barCode;
		this.name = name;
		this.price = price;
	}
    Productitem(int barCode) {
	}
	public int getBarCode() {
		return barCode;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Productitem [barCode=" + barCode + ", name=" + name
				+ ", price=" + price + "]";
	}
	@Override
	public int compareTo(Productitem o) {		
		return barCode-o.barCode;
	}
}
