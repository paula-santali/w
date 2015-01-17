import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;


public class BookDB {
	private Statement statement;
	public BookDB() throws ClassNotFoundException, SQLException{
	    statement=DatabaseConnection.getDatabaseConnection("root", "12345.com");
	    String sql="CREATE TABLE IF NOT EXISTS bookdb (title VARCHAR(254),  pages INTEGER,"
	            + "PRIMARY KEY(title), INDEX(pages))";
	    statement.executeUpdate(sql);
	}
	public void addBook(Book book) throws SQLException{
	    String title=book.getTitle();
	    int pages=book.getPages();
	    String sql="INSERT INTO bookdb (title,pages) VALUES ('"+title+"',"+pages+")";
	    statement.executeUpdate(sql);
	}
	 
	 
	public List<Book> getBooksByPages(int min, int max) throws SQLException{
	    List<Book> result=new ArrayList<Book>();
	    String sql="SELECT * FROM bookdb WHERE pages BETWEEN "+min+" AND "+max;
	    ResultSet rs=statement.executeQuery(sql);
	    while(rs.next()){
	        String title=rs.getString("title");
	        int pages=rs.getInt("pages");
	        result.add(new Book(title,pages));
	    }
	    return result;
	}

}
