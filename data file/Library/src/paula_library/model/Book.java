package paula_library.model;

public class Book implements Comparable<Book> {
	private String title;
	private String auther;
	private String category;
	private int pages;
	public String getTitle() {
		return title;
	}
	public String getAuther() {
		return auther;
	}
	public String getCategory() {
		return category;
	}
	public int getPages() {
		return pages;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private void setAuther(String auther) {
		this.auther = auther;
	}
	private void setCategory(String category) {
		this.category = category;
	}
	private void setPages(int pages) {
		this.pages = pages;
	}
	public Book(String title, String auther, String category, int pages) {
		super();
		this.title = title;
		this.auther = auther;
		this.category = category;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", auther=" + auther + ", category="
				+ category + ", pages=" + pages + "]";
	}
	@Override
	public int compareTo(Book arg0) {
		
		return title.compareTo(arg0.title);
	}

}
