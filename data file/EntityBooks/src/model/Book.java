package model;
import java.util.List;

import javax.persistence.*;
@Entity
public class Book {
@Id
String title;

@ManyToMany
List<Author>authors;

@ManyToOne
Publisher publisher;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public List<Author> getAuthors() {
	return authors;
}

public void setAuthors(List<Author> authors) {
	this.authors = authors;
}

public Publisher getPublisher() {
	return publisher;
}

public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}

@Override
public String toString() {
	return "Book [title=" + title + ", authors=" + authors + ", publisher="
			+ publisher + "]";
}
}
