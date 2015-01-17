package paula_library.model;

import java.util.Arrays;

public class LibraryArray implements Library{
private Book[] books;

public LibraryArray(){
	books=new Book[0];
}
public LibraryArray(Book[]books){
	this.books=Arrays.copyOf(books,books.length);
	Arrays.sort(this.books);
}

	@Override
	public Book[] getBooks() {
		
		return Arrays.copyOf(books,books.length);
	}

	@Override
	public Book[] getBooksTitle(String title) {
		Book pattern = new Book(title,null,null,0);
		int index=Arrays.binarySearch(books,pattern);
		int indexStart,indexEnd;
		Book[]result=null;
		if(index<0)
			result=new Book[0];
		else
		{
			indexStart=indexEnd=index;
			while(indexStart>=0&&books[indexStart].getTitle().equals(title))indexStart--;
			while(indexEnd<books.length&&books[indexEnd].getTitle().equals(title))indexEnd++;
			result=Arrays.copyOfRange(books,indexStart+1,indexEnd);
		}
		return result;
	}

	@Override
	public Book[] getBooksCategory(String category) {
		Book[]result= new Book[books.length];
		int indresult=0;
		for(int i=0;i<books.length;i++)
			if(books[i].getCategory().equals(category))
			result[indresult++]=books[i];
		
		return Arrays.copyOf(result,indresult);
	}

	@Override
	public Book[] getBooksAuther(String auther) {
		Book[]result=new Book[books.length];
		int indresult=0;
		for(int i=0;i<books.length;i++)
			if(books[i].getAuther().equals(auther))
				result[indresult++]=books[i];

		return Arrays.copyOf(result,indresult);
	}

	@Override
	public Book[] getBooksCategoryPagesGreat(String category, int pages) {
		Book[] result= new Book[books.length];
		int indresult=0;
		for(int i=0;i<books.length;i++)
			if(books[i].getCategory().equals(category)
					&&books[i].getPages()>=(pages))
				result[indresult++]=books[i];
				
		return Arrays.copyOf(result,indresult);
	}

	@Override
	public void addBook(Book book) {
		Book[] adbook=new Book[books.length+1];
		int ind=Arrays.binarySearch(books,book);
		if(ind<0)
			ind=-ind-1;
		System.arraycopy(books,0,adbook,0,ind);
		adbook[ind]=book;
		System.arraycopy(books,ind,adbook,ind+1,books.length-ind);
		books=adbook;
		
	}

}
