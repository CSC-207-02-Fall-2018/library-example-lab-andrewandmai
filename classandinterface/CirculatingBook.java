package classandinterface;

public class CirculatingBook extends LibraryBook implements Comparable<LibraryBook>{
	
	//adds 2 fields to Circulating books
	protected String currentHolder;
	protected String dueDate;

	//defines a circulating book by 4 parameters
	public CirculatingBook(String author, String name, String code, String num) {
		super(author, name, code, num);
		currentHolder = null;
		dueDate = null;
	}
	
	//returns the name of the patron who is having the book
	public String getCurrentHolder() {
		return currentHolder;
	}
	
	//returns the date by the book needs to be returned
	public String getDueDate() {
		return dueDate;
	}

	//assigns a current holder to the book
	public void setCurrentHolder(String curr) {
		currentHolder = curr;
	}
	
	//assigns a due date to the book by which it needs to be returned
	public void setDueDate(String due) {
		dueDate = due;
	}

	//return that the book is not checked out if it is not
	//returns the holder's name and the due date if it is checked out
	public String circulationStatus() {
		if (currentHolder == null) {
			return "currently not checked out";
		}
		else {
			return currentHolder + ", " + dueDate;
		}
	}

	//sets the name of the currentHolder
	//sets the dueDate by which the book needs to be returned
	public void checkout(String patron, String due) {
		currentHolder = patron;
		dueDate = due;
	}

	//resets all to null as no one checked the book out
	public void returned() {
		currentHolder = null;
		dueDate = null;
	}
	
	//prints out the information of a circulation book
	public String toString() {
		return super.toString() + 
				"currentHolder: " + currentHolder 
				+ "\n dueDate: " + dueDate + "\n";
	}

}

