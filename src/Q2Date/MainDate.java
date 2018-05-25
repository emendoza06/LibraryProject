package Q2Date;

import java.util.Scanner;

public class MainDate extends Date {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter month, day, and year");
		int userMonth = in.nextInt(); 
		int userDay = in.nextInt();
		int userYear = in.nextInt();
		
		//initialize object and its month, day, and year 
		
		Date date1 = new Date(); 
		date1.setMonth(userMonth); 
		date1.setDay(userDay);
		date1.setYear(userYear);
		
		
		date1.displayDate();		

	}

}
