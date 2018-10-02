package classandinterface;

public class Book {
	protected String author;
	protected String title;
	protected String ISBN;
	
	/* Class constructor */
	public Book() {
		author = "";
		title = "";
		ISBN = "";
	}
	
	/** Class constructor that assigns author name, title, and 
	 * unique code.  
	 * @param writer author of the book.
	 * @param name title of the book.
	 * @param code unique code assigned to the book.
	 */
	public Book(String writer, String name, String code) {
		author = writer;
		title = name;
		ISBN = code;
	}
	
	/** Retrieves author name.
	 * @return String returns the author name.
	 */
	public String getAuthor() {
		return author;
	}
	
	/** Retrieves title name. 
	 * @return String returns the title of the book.
	 */
	public String getTitle() {
		return title;
	}
	
	/** Retrieves unique code.
	 * @return String returns ISBM code
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * Assigns author name.
	 * @param artist artist is assigned to the author name.
	 */
	public void setAuthor(String artist) {
		author = artist;
	}
	
	/**
	 * Assigns book title.
	 * @param book book is assigned to the title of the book.
	 */
	public void setTitle(String book) {
		title = book;
	}
	
	/**
	 * Assigns unique code.
	 * @param num num is assigned to the ISBN of the book.
	 */
	public void setISBN(String num) {
		ISBN = num;
	}
	
	/**
	 * Prints out information about the book.
	 * @return String author, title, and ISBN are printed.
	 */
	public String toString() {
		return "\n   Author: " + author + 
			   "\n   Title: " + title + 
			   "\n   ISBN: " + ISBN;
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Henry M. Walker", "Problems for Computer Solution using BASIC", "0-87626-717-7");
		Book b2 = new Book("Mai Phuong Vu", "The Book on CA", "01-2124-2125");
		Book b3 = new Book("Andrew Park", "The Novel on CA", "0-142-1251-7");
		Book b4 = new Book();
		
		System.out.println("toString testing: ");
		System.out.println("Book 1: " + b1);
		System.out.println("Book 2: " + b2);
		System.out.println("Book 3: " + b3);
		System.out.println();
		
		System.out.println("getWriter testing: ");
		System.out.println("Book 1: " + b1.getAuthor());
		System.out.println("Book 2: " + b2.getAuthor());
		System.out.println("Book 3: " + b3.getAuthor());
		System.out.println();
		
		System.out.println("getTitle testing: ");
		System.out.println("Book 1: " + b1.getTitle());
		System.out.println("Book 2: " + b2.getTitle());
		System.out.println("Book 3: " + b3.getTitle());
		System.out.println();
		
		System.out.println("getISBN testing: ");
		System.out.println("Book 1: " + b1.getISBN());
		System.out.println("Book 2: " + b2.getISBN());
		System.out.println("Book 3: " + b3.getISBN());
		System.out.println();
		
		System.out.println("Setters testing:");
		b4.setAuthor("Sam Rebelsky");
		b4.setTitle("Teaching on Functional Problem Solving");
		b4.setISBN("0-1345-2345-2");
		System.out.println("   Author: "  + b4.getAuthor());
		System.out.println("   Title: " + b4.getTitle());
		System.out.println("   ISBN: " + b4.getISBN());
	}

}
