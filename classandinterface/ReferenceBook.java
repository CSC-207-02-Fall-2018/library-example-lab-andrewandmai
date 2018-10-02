package classandinterface;

public class ReferenceBook extends LibraryBook implements Comparable<LibraryBook>{
	
	//adds a new field for ReferenceBooks
	protected String collection;

	/** Class constructor that assigns writer, title, ISBN, 
	 * call number, and collection. 
	 * @param writer writer is the author's name.
	 * @param name name is the title of the book.
	 * @param code code is the unique ISBN code. 
	 * @param num num is the call number. 
	 * @param coll coll is the collection. 
	 */
	public ReferenceBook(String author, String name, String code, String num, String coll) {
		super(author, name, code, num);
		collection = coll; 
	}
	
	/**
	 * Retrieves the collection the book is in
	 * @return String collection is returned
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * Assigns the book to a collection 
	 * @param coll coll is assigned to collection.
	 */
	public void setCollection(String coll) {
		collection = coll;
	}
	
	/**
	 * Checks the status of the book
	 * @return String it is not circulating
	 */
	public String circulationStatus() {
		return "non-circulating reference book";
	}

	//Reference books cannot be checked out
	/**
	 * Tries to check it out
	 * @return String it is not circulating
	 * @param due due is not used
	 *        patron patron is not used
	 */
	public void checkout(String patron, String due) {
		System.out.println(patron + "cannot check out a reference book until");		
	}

	/**
	 * resets the data of the book
	 * @return String it is not circulating and cannot return it
	 */	
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
		
	}
	
	/**
	 * prints information of the reference book.
	 * @return String title, author, ISBN, 
	 * call number, and collection.
	 */
	public String toString() {
		return super.toString() + 
				"Collection: " + collection;
	}
}

