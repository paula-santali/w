package model;
import javax.persistence.*;
import java.util.*;
@Entity
public class Publisher {
@Id
String publName;
@OneToMany(mappedBy="publisher")
List<Book> books;
public String getPublName() {
	return publName;
}
public void setPublName(String publName) {
	this.publName = publName;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "Publisher [publName=" + publName + ", books=" + books + "]";
}
}
