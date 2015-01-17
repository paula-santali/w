
public class ArtBook extends LibraryBook{
	private String artbook;
	
	public ArtBook(){
		
	}
	public ArtBook(String auther,String title,int pages,int catalogNamber,int ontland, String artbook){
		super(auther,title,pages,catalogNamber,ontland);
		this.artbook=artbook;
	}
	public void setArtbook(String artbook) {
		this.artbook = artbook;
	}
	public String getArtbook() {
		return artbook;
	}
	public void display(){
		super.display();
		System.out.print("\t artbook->"+ artbook);
	}
}
