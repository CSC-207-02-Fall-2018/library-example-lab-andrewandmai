package classandinterface;

abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
	protected String callNumber;
	
	/**
	 * Class constructor that assigns writer, title, ISBN, and call number.
	 * @param writer writer is the author's name.
	 * @param name name is the title of the book.
	 * @param code code is the unique ISBN code. 
	 * @param num num is the call number. 
	 */
	public LibraryBook(String writer, String name, String code, String num) {
		super(writer, name, code);
		callNumber = num; 
	}
	
	// methods that depend on the type of class. 
	abstract String circulationStatus();
	abstract void checkout(String patron, String due);
	abstract void returned();
	
	/**
	 * Retrieves call number. 
	 * @return String call number is returned.
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * Assigns call number.
	 * @param callNum callNum is assigned to callNumber.
	 */
	public void setCallNumber(String callNum) {
		callNumber = callNum;
	}
	
	/** 
	 * implementation of Comparable's compareTo method
	 * @param lib:  Library object being compared
	 * @return 0 if call numbers of this and lib match
	 *         < 0 if call number of this comes before call number of lib
	 *         > 0 otherwise
	 */
	public int compareTo(LibraryBook lib) {
		return (callNumber.compareTo(lib.callNumber));
	}
	
	/**
	 * prints information of the book and the call number.
	 * @return String title, author, ISBN, and call number are printed.
	 */
	public String toString() {
		return super.toString() + 
				"\n   Call Number: " + callNumber;
	}
}
