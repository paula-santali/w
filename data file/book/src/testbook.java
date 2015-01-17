
public class testbook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		book book1=new book();
		book1.setAuther("Alfred Adler");
		book1.setTitle("Sensul Vietii");
		book1.setPages(210);
		//book1.display();
		
		book book2=new book("Ion Creanga","Amintiri din copilarie",216);
		//book2.display();
		
		LibraryBook book3=new LibraryBook("Mihai Eminescu","Luceafarul",3,12,0);
		//book3.display();
		
		FictionBook book4=new FictionBook("Alexandru Mipu","Legendele Vecului",567,1,1,"poveste");
		//book4.display();
		ChieldFictionBook book5=new ChieldFictionBook("Constantin Stirbu","Intimplari",201,1,0,"basme",7);
		//book5.display();
		
		TechBook book6=new TechBook("Gheorghii Mladenov","Nanoelectronica",342,2,1,"electonica");
		//book6.display();
		
		ArtBook book7=new ArtBook("Constantin Ciobanu","Pictura",27,1,1,"pictura");
		//book7.display();
		
		book arbook[]={book1,book2,book3,book4,book5,book6,book7};
		int i;
		for(i=0;i<arbook.length;i++){
			arbook[i].display();
		}
		
		
		
	}

}
