
public class TechBook extends LibraryBook{
	private String proff;
	
	public TechBook(){
	}
	public TechBook(String auther,String title,int pages,int catalogNomber,int ontland, String proff){
		super(auther,title,pages,catalogNomber,ontland);
		this.proff=proff;
	}
	public void setProff(String proff){
		this.proff=proff;
	}
	public String getProff(){
		return proff;
	}
	public void display(){
		super.display();
		System.out.print("\tproff->"+proff);
	}

}
