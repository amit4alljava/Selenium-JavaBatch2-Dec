class CashCustomer{
int id;
String name;
Order order = new Order(1001,"IPhone","Delhi");  // Has- A RelationShip
CashCustomer(int id , String name){
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "CashCustomer [id=" + id + ", name=" + name + ", order=" + order
			+ "]";
}

}
class Order
{
	int oid;
	String desc;
	String address;
	Order(int oid , String desc , String address){
		this.oid = oid;
		this.desc = desc;
		this.address = address;
	}
	@Override
	public String toString(){
		return "Oid "+oid + " Desc "+desc +" Address "+address;
	}
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashCustomer mike = new CashCustomer(1001,"Mike"); // Has-A 
		System.out.println(mike);

	}

}
