package LibraryProject;

import java.util.List;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		
		BookClass book1 = new BookClass("Cat in the hat", "Dr.Seus");
		BookClass book2 = new BookClass("Dog", "Grey Hound");
	
		
			

		LibraryClass lib = new LibraryClass("Eureka");
		lib.addBook(book1); 
		lib.addBook(book2);
		
		lib.getBookCount();
		
		CustomerClass cus1 = new CustomerClass("Epharra", "Mendoza");
		lib.addCustomer(cus1);
		
		lib.checkOutBook(cus1, book1);

		//print
		
		List<CustomerClass> customers = lib.getAllCustomers(); 
	
		for (int i = 0; i <customers.size(); i++) { 
			CustomerClass c = customers.get(i);
			System.out .println(c.getName());
			List <BookClass> var = c.getallBooksCheckedOut();
			for (int j = 0; j<var.size(); j++) { 
				BookClass b = var.get(j); 
				System.out.println(b.getTitle());
			}
			
			}
			
			
		
		}
		
	}
		

				
	
	