package model;

public interface IBookAuthPubl {
boolean createBook(String bookName,String [] authors,String publisher);
public String[]getAnySingleQuery(String strQuery);
public String[]getAnyMultipleQuery(String strQuery);
}
