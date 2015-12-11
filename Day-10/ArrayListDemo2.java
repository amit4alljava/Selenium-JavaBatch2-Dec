import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(int id , String name , double salary){
		this.id  = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]\n";
	}
	
}
public class ArrayListDemo2 {

	public static void main(String[] args) {
		Employee ram = new Employee(1001, "Ram", 9090);
		List<Employee> empList = new ArrayList<>();
		//ArrayList<Employee> empList = new ArrayList<>();
		empList.add(ram);
		Employee mike = new Employee(1002, "Mike", 6565);
		empList.add(mike);
		System.out.println(empList);
	}

}
