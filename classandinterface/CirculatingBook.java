package classandinterface;

public class CirculatingBook extends LibraryBook implements Comparable<LibraryBook>{
	protected String currentHolder;
	protected String dueDate;

	public CirculatingBook(String author, String name, String code, String num) {
		super(author, name, code, num);
		currentHolder = null;
		dueDate = null;
	}
	
	public String getCurrentHolder() {
		return currentHolder;
	}
	
	public String getDueDate() {
		return dueDate;
	}

	public void setCurrentHolder(String curr) {
		currentHolder = curr;
	}
	
	public void setDueDate(String due) {
		dueDate = due;
	}

	public int compareTo(ReferenceBook arg0) {
		return 0;
	}
	
	@Override
	public String circulationStatus() {
		if (currentHolder == null) {
			return "currently not checked out";
		}
		else {
			return currentHolder + ", " + dueDate;
		}
	}

	@Override
	public void checkout(String patron, String due) {
		currentHolder = patron;
		dueDate = due;
	}

	@Override
	public void returned() {
		currentHolder = null;
		dueDate = null;
	}
	
	public String toString() {
		return super.toString() + 
				"currentHolder: " + currentHolder 
				+ "\n dueDate: " + dueDate + "\n";
	}

}
