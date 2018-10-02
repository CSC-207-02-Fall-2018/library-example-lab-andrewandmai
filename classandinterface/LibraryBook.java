package classandinterface;

abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
	protected String callNumber;
	
	public LibraryBook(String author, String name, String code, String num) {
		super(author, name, code);
		callNumber = num; 
	}
	
	abstract String circulationStatus();
	abstract void checkout(String patron, String dueDate);
	abstract void returned();
	
	public String getCallNumber() {
		return callNumber;
	}

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
	 * @return title, author, ISBN, call number as a String for printing
	 */
	public String toString() {
		return super.toString() + 
				"Call Number: " + callNumber;
	}
}
