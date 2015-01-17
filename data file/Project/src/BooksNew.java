
public class BooksNew extends Book {
private int publishing;
private int price;
	@Override
	public String toString() {		
		return 
		"BooksNew [title=" + getTitle()
		+ ", author=" + getAuthor()
		+ ", publishing=" + publishing
		+ ", price=" + price + "]";
	}
	public int getPublishing() {
		return publishing;
	}
	public void setPublishing(int publishing) {
		this.publishing = publishing;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
	public BooksNew(String title, String author, int publishing, int price) {
		super(title, author);
		this.publishing = publishing;
		this.price = price;
	}

}
