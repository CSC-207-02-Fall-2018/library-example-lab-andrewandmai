package classandinterface;

public class Book {
	protected String author;
	protected String title;
	protected String ISBN;
	
	public Book() {
		author = "";
		title = "";
		ISBN = "";
	}
	
	public Book(String writer, String name, String code) {
		author = writer;
		title = name;
		ISBN = code;
	}
	
	public String getWriter() {
		return author;
	}
	
	public String getName() {
		return title;
	}
	
	public String getCode() {
		return ISBN;
	}
	
	public void setWriter(String artist) {
		author = artist;
	}
	
	public void setName(String book) {
		title = book;
	}
	
	public void setCode(String num) {
		ISBN = num;
	}
	
	public String toString() {
		return "Writer: " + author + 
			   "Title: " + title + 
			   "ISBN: " + ISBN;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
