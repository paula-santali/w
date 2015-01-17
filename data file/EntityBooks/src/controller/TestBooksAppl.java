package controller;

import model.IBookAuthPubl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBooksAppl {

	
	public static void main(String[] args) {
		AbstractApplicationContext ctx= new FileSystemXmlApplicationContext("beans.xml");
		IBookAuthPubl db=(IBookAuthPubl) ctx.getBean("database");
	String author[] ={"Ilf","Petrov"};
	db.createBook("12 chairs", author, "Mir");
	db.createBook("Gold cow", author, "Time");
	String[] result = db.getAnySingleQuery("SELECT b FROM Book b");
	display(result);
	String[] result1 = db.getAnyMultipleQuery("SELECT b.title, b.publisher FROM Book b");
	display(result1);
	}

	private static void display(String[] result) {
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
		
	}
}
