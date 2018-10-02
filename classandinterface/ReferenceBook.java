package classandinterface;

public class ReferenceBook extends LibraryBook implements Comparable<LibraryBook>{
	
	//adds a new field for ReferenceBooks
	protected String collection;

	//constructs a ReferenceBook that has 5 parameters
	public ReferenceBook(String author, String name, String code, String num, String coll) {
		super(author, name, code, num);
		collection = coll; 
	}
	
	//returns the collection type of the book
	public String getCollection() {
		return collection;
	}

	//assigns the book to a collection
	public void setCollection(String coll) {
		collection = coll;
	}
	
	//Reference books cannot be circulated
	public String circulationStatus() {
		return "non-circulating reference book";
	}

	//Reference books cannot be checked out
	public void checkout(String patron, String due) {
		System.out.println(patron + "cannot check out a reference book until");		
	}

	//Reference books cannot be returned
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
		
	}
	
	//prints out the information of the reference book
	public String toString() {
		return super.toString() + 
				"Collection: " + collection;
	}
}

