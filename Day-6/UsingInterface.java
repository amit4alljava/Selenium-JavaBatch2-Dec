// 1st way to use interface
// SAM (Single Abstract Method) Interface (Java 8)
@FunctionalInterface
interface Y1
{
	void print();
	//void show();
}
// Define a class
class Y2 implements Y1{
	@Override
	public void print(){
		System.out.println("Y2 Print Call");
	}
}

@FunctionalInterface
interface Adder{
	int add(int x, int y);
}


public class UsingInterface {

	public static void main(String[] args) {
		/*Y2 obj = new Y2();  // Call A Class
		obj.print();*/
		// 2nd Way of Using Interface
		// Creating a New Object and also define a class (Anonymous Class)
		// class ____ implements Y1 {}
		// override
		// create an object
		/*int a = 10;
		if(a==10){
		Y1 obj2 = new Y1(){
			@Override
			public void print(){
				System.out.println("This is Anonymous Class");
			}
		};
		obj2.print();
		}*/
		
		// 3rd Way (Java 8) 
		// Lambda Expression
		// Create Object, Define Class , Method Override
		Y1 obj3 = ()->{
			System.out.println("Lambda Expression Class1");
			System.out.println("Lambda Expression Class2");
		};
		obj3.print();
		
		Adder adder = (a,b)->  a + b;
		int z = adder.add(100, 200);
		System.out.println("Sum is "+z);
		
	}

}
