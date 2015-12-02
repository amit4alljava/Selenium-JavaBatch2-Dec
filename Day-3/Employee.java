// It start with Capital Letter
// Class Name Must be Noun
// SRP -Single Responsiblity Principle
// DRY
//Encapsulation
// Data Hiding
// Gud Encapsualtion =  private variables + public methods
public class Employee {
	// private is a keyword and it limit the access with in the class
	private int id; // Member Variables of a class
	private String name;
	private double salary;
	private String companyName;
	// Constructor Name always same as class name
	// constructor not return any thing
	// When U create any constructor , the default constructor kills
	// Every Class has default Constructor By Default
	Employee(){
		companyName = "UST"; // coming from DB
	}
	// Parameterized Constructor
	Employee(int id , String name , double salary){
		//Employee();
		//this(); // it will call the default constructor, 
		// call of constructor must be the first line
		this.id = id;
		this.name = name;
		this.salary= salary;
		//this();
	}
	
	public void setCompany(String companyName){
		this.companyName = companyName;
	}
	
	/*// Function (Method) i, n, s are the local variables
	 public void takeInput(int id, String name , double salary){
		//System.out.println(this);
		// this --> Keyword and hold the current object reference
		if(id>0 && salary>0){
		 this.id = id;  // Local variable assign to member variable
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Data so Data Can not be set");
		}
	}*/
	
	public void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}

}
