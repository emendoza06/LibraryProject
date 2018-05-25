package AbstractClassPractice;

abstract class Person {
	//fields
	String name;
	Person(String n){ 
		name = n;
	}
	//abstract
	abstract String getDetails();
	//method
	String getName() {
		return "name = " + name;
	}
}

//children classes
class Student extends Person{
	int studentNumber;
	//student method to get studentNumber
	Student(String n, int num){
		super(n);
		studentNumber = num;
	}
	public String getDetails() {
		return "Student Number =" + studentNumber;
	}
}

class Teacher extends Person{
	double salary;
	Teacher(String n, double s){ 
		super(n);
		salary = s;
	}
	public String getDetails() {
		return "Salary = " + salary;
	}
}

class Employee extends Person{
	String jobTitle;
	Employee(String n, String t){ 
		super(n); 
		jobTitle = t;
	}
	public String getDetails() { 
		return "Job title = " + jobTitle;
	}
}

//main
public class Practice { 
	public static void main(String [] args) { 
		//array object to create children list in abstract
		Person[] p = new Person[3];
		p[0] = new Student("Mary", 123);
		p[1]=new Teacher("Henry", 18.00);
		p[2] = new Employee("Steve", "Scientist");
		//arguments for children
		for(Person pp:p) { 
			System.out.println(p.getName() + " " + p.getDetails);
		}
	} 
} 
