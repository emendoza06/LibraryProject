package LibraryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryClass {
	//fields 
	
	private List<BookClass> bookCollection = new ArrayList<BookClass>();
	private String libraryName = "";
	private String title = "";
	private String author ="";
	private List<CustomerClass> customers = new ArrayList<CustomerClass> ();
	
	
	public LibraryClass(String libraryName) { 
		
	}
	public void addBook(BookClass book) { 
		bookCollection.add(book);
	}
	public int getBookCount() { 
		return bookCollection.size();
	}
	
	public boolean isContained(BookClass book) { 
		for (int i = 0; i<bookCollection.size(); i++) { 
			BookClass bookFound = bookCollection.get(i); 
			if (bookFound.getTitle()==book.getTitle()) { 
				return true;
			}
			
		}
		return false;
	}
	public void addCustomer(CustomerClass customer) { 
		customers.add(customer);
	}
	public void checkOutBook(CustomerClass cus1, BookClass book) { 
		cus1.addBooksCheckedOut(book);
	}
	
	public List<CustomerClass> getAllCustomers() { 
		return customers;
	}
}

