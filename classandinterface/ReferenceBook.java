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

	@Override
	public String circulationStatus() {
		return "non-circulating reference book";
	}

	@Override
	public void checkout(String patron, String due) {
		System.out.println(patron + "cannot check out a reference book until");		
	}

	@Override
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
		
	}
	
	public String toString() {
		return super.toString() + 
				"Collection: " + collection;
	}
}
