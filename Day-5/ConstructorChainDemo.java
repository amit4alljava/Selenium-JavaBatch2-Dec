class A1
{
A1(){
	System.out.println("A1 Default Cons Call...");
}
A1(int x){
	this();
	System.out.println("A1 Param Cons Call");
}
}
class B1 extends A1{
	B1(){
		super(100);
		//super(); // It is call the parent class default cons
		System.out.println("B1 Default Cons Call");
	}
	B1(int x){
		this();
		//super(x);
		System.out.println("B1 Param Cons Call");
	}
}

public class ConstructorChainDemo {

	public static void main(String[] args) {
		B1 obj = new B1(888);

	}

}
