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
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	String circulationStatus() {
		// TODO Auto-generated method stub
		return currentHolder + ", " + dueDate;
	}

	@Override
	void checkout(String patron, String due) {
		// TODO Auto-generated method stub
		currentHolder = patron;
		dueDate = due;
	}

	@Override
	String returned() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return super.toString() + 
				"currentHolder: " + currentHolder 
				+ "\n dueDate: " + dueDate + "\n";
	}

}
