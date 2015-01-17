package controller;

import model.BookH;
import model.IBookDB;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookDBTest {

	
	public static void main(String[] args) {
		AbstractApplicationContext ctx =new FileSystemXmlApplicationContext("beans.xml");
		IBookDB books =(IBookDB) ctx.getBean("book");
        BookH array[]={ new BookH("Java","Yuri",250),new BookH("Basic Programming","Igor",270),new BookH("ASP","Ior",100)};
        for(BookH book:array)
        	books.addBook(book);
        System.out.println(books.getBooksByAuthor("Igor"));
        System.out.println(books.getBooksByPages(200, 300));
        System.out.println(books.removeBook("ASP"));
        
	}

}
