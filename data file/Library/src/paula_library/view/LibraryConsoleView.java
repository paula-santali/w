package paula_library.view;

import paula_library.model.Book;
import paula_library.model.Library;

public class LibraryConsoleView implements LibraryView{
private Library library;

	public void showLibrary(String str) {
		System.out.println(str);
		Book[] BooksView= library.getBooks();
		for(int i=0;i<BooksView.length;i++)
			System.out.println(BooksView[i]);
		
		
	}

	@Override
	public void setLibrary(Library library) {
		this.library=library;
		
	}

	@Override
	public void showLibrary() {
		// TODO Auto-generated method stub
		
	}

}
