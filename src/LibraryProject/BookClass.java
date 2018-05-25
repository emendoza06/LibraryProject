package LibraryProject;

import java.util.List;

public class BookClass {
	//fields 
	private String title; 
	private String author;
	private int isbn; 
	private int numberOfPages;
public BookClass(String title, String author) { 
		this.title = title; 
		this.author = author;
	}
public String getTitle() {
	return title;
}
}