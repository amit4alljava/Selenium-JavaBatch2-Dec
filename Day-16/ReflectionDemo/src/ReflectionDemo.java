import java.util.Scanner;

/*
 * Code on Fly
 * We r not using the static coding (Compile Time)
 * We r going to write dynamic coding
 */
class A
{
	 A(){
		System.out.println("A Class Cons Call");
	}
}
class B
{
	B(){
		System.out.println("B Class Cons Call");
	}
}
class C
{
	C(){
		System.out.println("C Class Cons Call");
	}
}
public class ReflectionDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("Enter the Class Name to create an Object");
		Scanner scanner =new Scanner(System.in);
		String className = scanner.next();
		/*
		 * Traditional Style of Coding
		 * Static Coding , Compile Time Coding , Eager Coding
		 */
		
		//Dynamic Coding , Run Time Coding , Lazy Coding
		Class.forName(className).newInstance();  //Dynamic Load class and Object create
		
		
		//A1 obj = new A1();
		/*if(className.equals("A")){
			A obj = new A();
		}
		else
		if(className.equals("B")){
			B obj = new B();
		}
		else
			if(className.equals("C")){
				C obj = new C();
			}	*/

	}

}
