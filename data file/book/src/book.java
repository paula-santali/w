
public class book {
	private String auther;
	private String title;
	private int pages;
	
	public book(){
		
	}
	public book(String auther,String title,int pages){
		if( auther!="")
			this.auther=auther;
		else
			System.out.println("Error in parameter");
		if(title!="")
			this.setTitle(title);
		else
			System.out.println("Error in parameter");
		if(pages>0)
			this.setPages(pages);
		else
			System.out.println("Error in parameter");
	}
		public void setAuther(String auther){
			if( auther!="")
				this.auther=auther;
			else
				System.out.println("Error in parameter");
		}
		public String getAuther(){
	
			return auther;
		}
		public void setTitle(String title) {
			if(title!="")
			this.title = title;
			else
				System.out.println("Error in parameter");
		}
		public String getTitle() {
			
			return title;
		}
		public void setPages(int pages) {
			if(pages>0)
				this.pages=pages;
			else
				System.out.println("Error in parameter");
			this.pages = pages;
		}
		public int getPages() {
			return pages;
		}
		public void display(){
			System.out.print("\nauther->"+auther);
			System.out.print("\ttitle->"+title);
			System.out.print("\tpages->"+pages);
		}
		
	}
	


