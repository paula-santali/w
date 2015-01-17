import java.sql.SQLException;


public class TestBookDBappl {

	
	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		 BookDB db=new BookDB();
	        Book[]books={new Book("Amintiri din copilarie",240), new Book("Gogoasha", 201)};
	        for(int i=0; i<books.length; i++)
	            db.addBook(books[i]);
	       // System.out.println(db.getBooksByPages(200, 240));
	 

	}

}
