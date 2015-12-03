
public class TestEmployee {

	public static void main(String[] args) {
		int e ;  // In Java we need to initalize the local variable before use
		e = 100;
		e++;
		Employee mike; // mike is a variable of Employee Type
		mike = new Employee(1001,"Mike",9999);
		mike.setSalary(mike.getSalary() + 2000);
		mike.setPhone("2222");
		System.out.println(mike.getId()+ " "+mike.getSalary()+" "+mike.getPhone());
		/*System.out.println("Id "+mike.id);
		System.out.println("Name "+mike.name);
		System.out.println("Salary "+mike.salary);*/
		/*mike.id = -1001;
		mike.name="Mike";
		mike.salary = -9090;
		*/
		//mike.takeInput(-1001, "Mike", -9090);  //4544.takeInput();
		//mike.print();
		/*mike.id = 1001;
		mike.name="Mike";
		mike.salary = 9090;*/
		/*System.out.println("Id "+mike.id);
		System.out.println("Name "+mike.name);
		System.out.println("Salary "+mike.salary);
		*/
		//Employee tom = new Employee(1002,"Tom",3333);
		//tom.setCompany("TCS");
		//tom.takeInput(1002, "Tom", 8888);
		//tom.print();
		/*tom.id = 1002;
		tom.name="Tom";
		tom.salary=9888;*/
		/*System.out.println("Tom Id "+tom.id);
		System.out.println("Tom Name"+tom.name);
		System.out.println("Tom Salary "+tom.salary);
		*/// mike is a reference variable because it holding a reference
		// new it is a keyword , and it used to allocate a memory  on runtime
		// Inside Heap it create Employee Object
		/*int x ; // x is a variable of int type
		x = 9090; // Assign Value to x
		
*/	}

}
