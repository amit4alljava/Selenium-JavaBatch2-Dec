class Print {
	Emp printEmpInfo(Emp emp){
		System.out.println("Id "+emp.id);
		System.out.println("Name "+emp.name);
		System.out.println("Salary "+emp.salary);
		emp.salary = emp.salary + 90000;
		return emp;
	}
}
class Emp{
	 int id;
	 String name;
	 double salary;
	Emp(int id , String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	} }
public class PassingAndReturnObject {

	public static void main(String[] args) {
		Emp ram = new Emp(1001,"Ram",9999);
		Print print = new Print();
		Emp e = print.printEmpInfo(ram);
		System.out.println(e.salary);

	}

}
