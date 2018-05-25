package Q1Box;

import java.util.Scanner;

public class MainBox extends BoxClass{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter height, length, width");
		int userHeight = in.nextInt();
		int userLength = in.nextInt();  
		int userDepth = in.nextInt();
		
		//create first object
		BoxClass box1 = new BoxClass();
		box1.setHeight(userHeight);
		box1.setLength(userLength);
		box1.setDepth(userDepth);
		
		
		//call on methods for first object
		System.out.println(box1.volume());
		System.out.println(box1.SA());
		System.out.println(box1.cost());
		
		;

	} 
}



