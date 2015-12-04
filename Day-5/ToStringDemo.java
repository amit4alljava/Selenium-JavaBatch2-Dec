class Customer{
	private int id;
	private String name;
	Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	
	/*@Override
	public String toString(){
		return "Id "+id+" Name "+name;
	}*/
}
public class ToStringDemo {

	public static void main(String[] args) {
		Object o;
		String a = new String("Amit");
		Customer customer = new Customer(1001,"Ram");
		
		System.out.println("A is "+a);
		System.out.println("Customer is "+customer);

	}

}
