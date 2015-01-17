
public class FictionBook extends LibraryBook{
	private String genre;
	
	public FictionBook(){
		
	}
	public FictionBook(String auther,String title,int pages,int catalogNamber,int ontland,String genre){
		super(auther,title,pages,catalogNamber,ontland);
		this.setGenre(genre);
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
		public void display(){
			super.display();
		System.out.print("\tgenre->"+genre);
	}

}
