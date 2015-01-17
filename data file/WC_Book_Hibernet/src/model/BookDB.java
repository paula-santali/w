package model;
import java.awt.print.Book;
import java.util.*;
import javax.persistence.*;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BookDB implements IBookDB{
@PersistenceContext(unitName="springHibernate")
EntityManager em;
@Override
@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
public boolean  addBook(BookH book){
	boolean result= false;
	if(em.find(BookH.class, book.getTitle())==null)
		em.persist(book);
	result =true;
	return result;
}
@Override
@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
public BookH removeBook(String title){
	BookH result = em.find(BookH.class, title);
	if(result!=null)
		em.remove(result);
	return result;
}
@Override
public BookH getByTitle(String title){
	return em.find(BookH.class,title);
}
@Override
public List <BookH> getBooksByAuthor(String authorName){
	Query query =em.createQuery("SELECT b FROM BookH b WHERE b.author=?1");
	query.setParameter(1, authorName);
	List <BookH> result =query.getResultList();
	return result;
}
public List<BookH> getBooksByPages(int min,int max){
	Query query=em.createQuery("SELECT b FROM BookH b WHERE b.pages BETWEEN ?1 AND ?2 ");
	query.setParameter(1, min);
	query.setParameter(2, max);
	List <BookH> result =query.getResultList();
	return result;
}
}
