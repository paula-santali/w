package model;
import javax.persistence.*;
import java.util.*;
@Entity
public class Author {
@Id
String name;
@ManyToMany(mappedBy="authors")
List<Book> books;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "Author [name=" + name + ", books=" + books + "]";
}

}
