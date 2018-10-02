package classandinterface;

public class CirculatingBook extends LibraryBook implements Comparable<LibraryBook>{
	
	//adds 2 fields to Circulating books
	protected String currentHolder;
	protected String dueDate;
	
	/** Class constructor that assigns writer, title, ISBN, and call number.  
	 *  and initializes currentHolder and dueDate as null.
	 * @param writer writer is the author's name.
	 * @param name name is the title of the book.
	 * @param code code is the unique ISBN code. 
	 * @param num num is the call number. 
	 */
	public CirculatingBook(String author, String name, String code, String num) {
		super(author, name, code, num);
		currentHolder = null;
		dueDate = null;
	}
	
	/**
	 * Retrieves current holder's name. 
	 * @return String currentHolder is returned.
	 */
	public String getCurrentHolder() {
		return currentHolder;
	}
	
	/**
	 * Retrieves the due date of the book. 
	 * @return String dueDate is returned.
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Assigns current holder's name. 
	 * @param curr curr is assigned to currentHolder.
	 */
	public void setCurrentHolder(String curr) {
		currentHolder = curr;
	}
	
	/**
	 * Assigns due date of the book. 
	 * @param due due is assigned to dueDate.
	 */
	public void setDueDate(String due) {
		dueDate = due;
	}

	/**
	 * checks if the book is checked out
	 * @return String holder's name and date if it is checked out
	 * 		   String it is not checked out
	 */
	public String circulationStatus() {
		if (currentHolder == null) {
			return "currently not checked out";
		}
		else {
			return currentHolder + ", " + dueDate;
		}
	}

	/**
	 * Assigns current holder and due date to the book. 
	 * @param due due is assigned to dueDate.
	 *        patron patron is assigned to currentHolder.
	 */
	public void checkout(String patron, String due) {
		currentHolder = patron;
		dueDate = due;
	}

	/**
	 * resets the status of the book to non-checked out
	 * @return String holder's name and date as null
	 */
	public void returned() {
		currentHolder = null;
		dueDate = null;
	}
	
	/**
	 * prints information of the circulating book.
	 * @return String title, author, ISBN, and call number,
	 * current holder, due date are printed.
	 */
	public String toString() {
		return super.toString() + 
				"currentHolder: " + currentHolder 
				+ "\n dueDate: " + dueDate + "\n";
	}

}


