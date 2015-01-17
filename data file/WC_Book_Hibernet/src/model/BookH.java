package model;
import javax.persistence.*;
@Entity
public class BookH {
@Id
private String title;
private String author;
private int pages;
public BookH(String title, String author, int pages) {
	super();
	this.title = title;
	this.author = author;
	this.pages = pages;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public BookH() {
	super();
}
@Override
public String toString() {
	return "BookH [title=" + title + ", author=" + author + ", pages=" + pages
			+ "]";
}
}
