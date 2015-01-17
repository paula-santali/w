
public class LibraryBook extends book {
	private int catalogNamber;
	private int ontland;
	
	 public LibraryBook(){
		
	}
	 public LibraryBook(String auther,String title,int pages,int catalogNamber,int ontland){
		 super( auther, title, pages);
		 this.setCatalogNamber(catalogNamber);
		 this.setOntland(ontland);
	 }
	
	
	private void setOntland(int ontland2) {
		// TODO Auto-generated method stub
		
	}
	public void setCatalogNamber(int catalogNamber) {
		this.catalogNamber = catalogNamber;
	}
	public int getCatalogNamber() {
		return catalogNamber;
	}
	public void ontland(int ontland) {
		this.ontland = ontland;
	}
	public int getOntland() {
		return ontland;
	}
	 
	public  void display(){
		 super. display();
		 System.out.print("\tcatalogNamber->"+catalogNamber);
		 System.out.print("\tontland->"+ontland);
	 }

}
