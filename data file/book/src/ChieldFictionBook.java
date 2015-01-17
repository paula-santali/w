
public class ChieldFictionBook extends FictionBook {
	private int age;
	
	public ChieldFictionBook(){
		
	}
	public ChieldFictionBook(String auther,String title,int pages,int catalogNamber,int ontland,String genre,int age){
		super(auther,title,pages,catalogNamber,ontland,genre);
		this.setAge(age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
public void display(){
	super.display();
	System.out.print("\tage->"+age);
}
}
