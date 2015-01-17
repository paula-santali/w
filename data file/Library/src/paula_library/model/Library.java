package paula_library.model;



public interface Library {
	public Book[] getBooks();
	public Book[] getBooksTitle(String title);
	public Book[] getBooksCategory(String category);
	public Book[]getBooksAuther(String auther);
	public Book[] getBooksCategoryPagesGreat(String category,int pages);
	public void addBook(Book book);
	

}
