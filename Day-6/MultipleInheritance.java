// Multiple Inheritance is allowed in case of Interfaces.
interface S1{
	void show();
}
interface S2{
	void show();
}
interface S3 extends S1, S2{
	void print();
}
class S4 implements S3{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		

	}

}
