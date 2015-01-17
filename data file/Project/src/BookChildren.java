
public class BookChildren extends Book {
	
  
	private String genre;
	@Override
	public String toString() {
		return "BookChildren [title="+getTitle()+",auther="+getAuthor()+",genre="+genre+"]";
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public BookChildren(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	
	

}
