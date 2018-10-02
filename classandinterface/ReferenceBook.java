package classandinterface;

public class ReferenceBook extends LibraryBook implements Comparable<LibraryBook>{
	protected String collection;

	
	public ReferenceBook(String author, String name, String code, String num, String coll) {
		super(author, name, code, num);
		collection = coll; 
	}
	
	public String getCollection() {
		return collection;
	}

	public void setCollection(String coll) {
		collection = coll;
	}

	public int compareTo(ReferenceBook arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String circulationStatus() {
		return "non-circulating reference book";
	}

	@Override
	void checkout(String patron, String due) {
		due = patron + "cannot check out a reference book";
		
	}

	@Override
	String returned() {
		return "reference book could not have been checked out -- return impossible";
		
	}
	
	public String toString() {
		return super.toString() + 
				"Collection: " + collection;
	}
}
