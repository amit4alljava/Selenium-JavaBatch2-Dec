interface R1
{
	default void show(){
		
	}
	// NonStatic (Instance Method)
	default void print(){
		System.out.println("R1 Print Call");
	}
}
interface R2{
	default void print(){
		System.out.println("R2 Print Call");
	}
}
interface R3 extends R1,R2{
	@Override
	 default void print(){
		R1.super.print();
		R2.super.print();
	}
}
class R4 implements R3{
	
}

class Y11
{
	int x ;
	static int z;
	Y11(){
		x = 100;
		System.out.println("Default Cons  Call "+x);
	}
	static{
		z = 2000;
		System.out.println("Static Block Called.. "+z);
	}
}

public class Java8InterfaceDemo {

	public static void main(String[] args) {
		/*R4 obj = new R4();
		obj.print();*/
		Y11 obj1 = new Y11();
		Y11 obj2 = new Y11();
		Y11 obj3 = new Y11();

	}

}
