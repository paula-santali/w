package model;

import java.util.List;

public interface IBookDB {
boolean addBook(BookH book);
BookH removeBook(String title);
BookH getByTitle(String title);
List <BookH> getBooksByAuthor(String authorName);
List <BookH> getBooksByPages(int min,int max);
}