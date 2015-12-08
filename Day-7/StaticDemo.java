
class Student
{
	int id;  // Instance Variables
	String name;
	int counter2 ;  // Instance Variable
	static int counter;  // Class variables or Static Variable
	Student(int id, String name){
		this.id = id;  
		this.name = name;
		counter++;  
		counter2++;
		System.out.println("Static Counter "+counter);
		System.out.println("Instance Counter2 "+counter2);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Student mike = new Student(1001,"Mike");
		Student tom = new Student(1002,"Tom");

	}

}
