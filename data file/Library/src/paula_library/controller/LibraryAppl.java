package paula_library.controller;

import paula_library.model.Library;
import paula_library.model.LibraryArray;
import paula_library.view.LibraryConsoleView;
import paula_library.view.LibraryView;

public class LibraryAppl {


	private static final int nBooks = 1000;
	private static final int nRequests = 100000;
	private static final int nRequestsTitle = 10;
	private static final int nRequestsCategory = 70;
	private static final int nRequestsAuther = 10;
	private static final int nRequestsCategoryPage = 10;

	public static void main(String[] args) {
		Library library= new LibraryArray();
		LibraryView view=new LibraryConsoleView();
		LibraryController controller=new LibraryController(library,view,nBooks,nRequests,nRequestsTitle,nRequestsCategory,
				nRequestsAuther,nRequestsCategoryPage);
		controller.run();
			System.out.println("The ellapsed time is "+controller.getRunTime());
		}

	}

