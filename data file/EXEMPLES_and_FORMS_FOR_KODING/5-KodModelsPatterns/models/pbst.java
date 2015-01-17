package models;

public class pbst {
	private static String name;
	private static String author;
	private static String publishing_house;
	private static String year;
	protected static int count=0;
	private static String age;
	private static String numgournal;
	private static String specialthem;
	private static String genre;
	private static String theme_book;
	private static String specific_layot;
	private static int counterBook=0;
	private static String Libraryname="Amir";
	public pbst(){}
	
	public static void setName(String name) {
		pbst.name = name;
	}
	public static String getName() {
		return name;
	}
	public static void setAuthor(String author) {
		pbst.author = author;
	}
	public static String getAuthor() {
		return author;
	}
	public static void setPublishing_house(String publishing_house) {
		pbst.publishing_house = publishing_house;
	}
	public static String getPublishing_house() {
		return publishing_house;
	}
	public static void setYear(String year) {
		pbst.year = year;
	}
	public static String getYear() {
		return year;
	}
	public static void setAge(String age) {
		pbst.age = age;
	}
	public static String getAge() {
		return age;
	}
	public static void setNumgournal(String numgournal) {
		pbst.numgournal = numgournal;
	}
	public static String getNumgournal() {
		return numgournal;
	}
	public static void setSpecialthem(String specialthem) {
		pbst.specialthem = specialthem;
	}
	public static String getSpecialthem() {
		return specialthem;
	}
	public static void setGenre(String genre) {
		pbst.genre = genre;
	}
	public static String getGenre() {
		return genre;
	}
	public static void setTheme_book(String theme_book) {
		pbst.theme_book = theme_book;
	}
	public static String getTheme_book() {
		return theme_book;
	}
	public static void setSpecific_layot(String specific_layot) {
		pbst.specific_layot = specific_layot;
	}
	public static String getSpecific_layot() {
		return specific_layot;
	}
	public static void setCounterBook(int counterBook) {
		pbst.counterBook = counterBook;
	}
	public static int getCounterBook() {
		return counterBook;
	}
	public static void setLibraryname(String libraryname) {
		Libraryname = libraryname;
	}
	public static String getLibraryname() {
		return Libraryname;
	}

	@Override
	public String toString() {
		return "pbst []";
	}
	
	
}
