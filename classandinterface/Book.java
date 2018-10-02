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
	public String getWriter() {
		return author;
	}
	
	/** Retrieves title name. 
	 * @return String returns the title of the book.
	 */
	public String getName() {
		return title;
	}
	
	/** Retrieves unique code.
	 * @return String returns ISBM code
	 */
	public String getCode() {
		return ISBN;
	}
	
	/**
	 * Assigns author name.
	 * @param artist artist is assigned to the author name.
	 */
	public void setWriter(String artist) {
		author = artist;
	}
	
	/**
	 * Assigns book title.
	 * @param book book is assigned to the title of the book.
	 */
	public void setName(String book) {
		title = book;
	}
	
	/**
	 * Assigns unique code.
	 * @param num num is assigned to the ISBN of the book.
	 */
	public void setCode(String num) {
		ISBN = num;
	}
	
	/**
	 * Prints out information about the book.
	 * @return String author, title, and ISBN are printed.
	 */
	public String toString() {
		return "Author: " + author + 
			   "Title: " + title + 
			   "ISBN: " + ISBN;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
