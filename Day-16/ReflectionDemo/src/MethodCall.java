import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc{
	int add(int x, int y){
		return x + y;
	}
	int subtract(int x, int y){
		return x - y;
	}
	int multiply(int x, int y){
		return x * y;
	}
	int divide(int x, int y){
		return x / y;
	}
}
public class MethodCall {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Calc cal = new Calc();
		int result = 0;
		System.out.println("type add for  addition");
		System.out.println("type subtract for  subtraction");
		System.out.println("type multiply for  multiplication");
		System.out.println("type divide for  division");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice = scanner.next();
		// Creating Object Dynamically , Loading Class Dynamically
		Object object = Class.forName("Calc").newInstance();
		// Get the Class of an Object and From Class get the Method of a class
		Method method = object.getClass().getDeclaredMethod(choice, int.class,int.class);
		result = (Integer)method.invoke(object, 100,200);
		/*if(choice.equals("add")){
			result =cal.add(100,200);
		}
		else
		if(choice.equals("subtract")){
			result =cal.subtract(100,200);
		}
		if(choice.equals("multiply")){
			result =cal.multiply(100,200);
		}
		if(choice.equals("divide")){
			result =cal.divide(100,2);
		}*/
		System.out.println("Result is "+result);
		

	}

}
