package LibraryProject;

import java.util.ArrayList;
import java.util.List;

public class CustomerClass {
	private String lastName;
	private String firstName;
	private List<BookClass> booksCheckedOut = new ArrayList();
	public Object getallBooksCheckedOut;
	
public CustomerClass(String lastName, String firstName) { 
	this.lastName = lastName; 
	this.firstName = firstName;
		
	}
public void addBooksCheckedOut(BookClass book) { 
	booksCheckedOut.add(book);
}
public List<BookClass> getallBooksCheckedOut() { 
	return booksCheckedOut;
}
public String getName() { 
	return firstName + " " +lastName;
}
}