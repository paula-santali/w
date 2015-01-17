package paula_library.controller;

import paula_library.model.Book;
import paula_library.model.Library;
import paula_library.model.LibraryArray;
import paula_library.view.LibraryView;

public class LibraryController {
	private static final String TITLE = "title";
	private static final String AUTHOR = "auther";
	private static final String CATEGORY = "category";
	private static final int PAGES = 5000;
	private Library library;
	private LibraryView view;
	private int runTime;
	private int nBooks;
	private int nRequests;
	private int nRequestsTitle;
	private int nRequestsCategory;
	private int nReguestsCategoryPage;
	private int nReguestsAuther;
	private int nRequestsAuthor;
	public LibraryController(Library library,  LibraryView view,int nBooks,
			int nRequests, int nRequestsTitle, int nRequestsCategory,
			int nRequestsCategoryPage, int nRequestsAuther) {
		super();
		this.library = library;
		this.view = view;
		this.nBooks = nBooks;
		this.nRequests = nRequests;
		this.nRequestsTitle = nRequestsTitle;
		this.nRequestsCategory = nRequestsCategory;
		this.nReguestsCategoryPage = nRequestsCategoryPage;
		this.nReguestsAuther = nRequestsAuther;
	}
	public void run(){
		//este functia care ne ajuta sa calculam timpul care ne ya ca sa facem zaprosuri 
		Book[] books=new Book[nBooks];
	for(int i =0;i<nBooks;i++)
		books[i]=createRandBook();
	long time1=System.currentTimeMillis();//timpul1 inceputul zaprosurilor
	
	 for(int i=0; i<nBooks; i++)
		   library.addBook(books[i]);
		  int amount;
		  amount=nRequests*nRequestsTitle/100;
		  for(int i=0; i<amount; i++)
		   library.getBooksTitle(TITLE); // zapros de tip1 
		  amount=nRequests*nRequestsAuthor/100;
		  for(int i=0; i<amount; i++)
		   library.getBooksAuther(AUTHOR); // zapros de tip2
		  amount=nRequests*nRequestsCategory/100;
		  for(int i=0; i<amount;i++)
		   library.getBooksCategory(CATEGORY); // zapeos de tip3
		  amount=nRequests*nReguestsCategoryPage/100;
		  for(int i=0; i<amount;i++)
		   library.getBooksCategoryPagesGreat(CATEGORY,PAGES); // zapros de tipul4
		  long time2=System.currentTimeMillis(); // primim timpul la sfirsitul zaprosurilor
		  runTime=(int) (time2-time1); // se skade dim timpul de la sfirsitul zaprosurilor si timpul
		                                 //de la inceputul zaprosurilo!
		 }
		 private Book createRandBook() {
		String title="title"+(int)(Math.random()*10);
		String auther="auther"+(int)(Math.random()*100);
		String category="category"+(int)(Math.random()*10);
		int pages= (int) (100+(Math.random()*5000));
		return new Book(title,auther,category,pages);
	}
		
	public int getRunTime(){
		return runTime;
	}

}
