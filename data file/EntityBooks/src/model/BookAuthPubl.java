package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BookAuthPubl implements IBookAuthPubl {
@PersistenceContext(unitName="springHibernate", type=PersistenceContextType.EXTENDED)
EntityManager em;
	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	public boolean createBook(String bookName, String[] authors,
			String publisher) {
		boolean result =false;
		if(em.find(Book.class, bookName)==null){
		Book book=new Book();
		List<Author> refAuthors=getAuthors(authors);
		book.setTitle(bookName);
		book.setAuthors(refAuthors);
		Publisher refPubl =getPublisher(publisher);
		book.setPublisher(refPubl);
		em.persist(book);
		result= true;
		}
		
		return result;
	}

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	private Publisher getPublisher(String publisher) {
		Publisher refPubl=em.find(Publisher.class, publisher);
			if(refPubl==null){
				refPubl=new Publisher();
				refPubl.setPublName(publisher);
				em.persist(refPubl);
			}
		
		return refPubl;
	}

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	private List<Author> getAuthors(String[] authors) {
		List<Author> result=new ArrayList<Author>();
		Author author;
		for(int i=0;i<authors.length;i++){
			 author= em.find(Author.class, authors[i]);
			if(author==null){
				author=new Author();
			author.setName(authors[i]);
			em.persist(author);
		}
		result.add(author);
		}
		return result;
	}

	@Override
	public String[] getAnySingleQuery(String strQuery) {
		Query query=em.createQuery(strQuery);
		List <Object> result =query.getResultList();
		String [] array= new String[result.size()];
		int index=0;
		for( Object obj:result)
			array[index++]=obj.toString();
		return array;
		
	}

	@Override
	public String[] getAnyMultipleQuery(String strQuery ) {
		
		Query query=em.createQuery(strQuery);
		List <Object[]> result =query.getResultList();
		String [] array= new String[result.size()];
		int ind=0;
		for(Object[] arObj:result){
			String strResult =arObj[0].toString();
			for(int i=1;i<arObj.length;i++)
				strResult+=" "+arObj[i].toString();
			array[ind++]=strResult;
		}
		return array;
	}

	
}
