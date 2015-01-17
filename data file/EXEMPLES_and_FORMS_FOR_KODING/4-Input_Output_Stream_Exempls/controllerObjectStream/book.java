package controllerObjectStream;
import java.io.Serializable;
public class book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private int price;
	private String author;

	public book(){}
	public book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}


	public String getTitle() {
		return title;
	}public void setTitle(String title) {
		this.title = title;
	}public int getPrice() {
		return price;
	}public void setPrice(int price) {
		this.price = price;
	}public String getAuthor() {
		return author;
	}public void setAuthor(String author) {
		this.author = author;
	}public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	@Override
	public String toString() {
		return "book [title=" + title + ", price=" + price + ", author="
				+ author + "]";
	}	
}
