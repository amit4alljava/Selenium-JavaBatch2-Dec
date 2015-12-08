// Utility Class = All Static methods + private constructor
//class MathOperations

// Utility Interface is required
interface MathOperations  // Java 8 
{
	static int y = 10;
	int z = 10; 
	/*private MathOperations(){
		
	}*/
	static int sin(){
		int x = 10;
		return 90 + x + y ;
	}
	static int cos(){
		return 45;
	}
	static int tan(){
		return 60;
	}
}
//Utility Class
class Validation
{
	private Validation(){}
	static boolean isBlank(String value){
		if(value!=null && value.length()>0){
			return false;
		}
		return true;
	}
	static boolean isCorrectPasswordLength(String value){
		if(value!=null && value.length()>=8){
			return true;
		}
		return false;
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		//MathOperations m = new MathOperations();
		//System.out.println(m.cos());
		System.out.println();
		//System s = new System();
		System.out.println(MathOperations.sin());
		System.out.println(MathOperations.cos());
		System.out.println(MathOperations.tan());
		System.out.println(Validation.isBlank("Amit"));

	}

}
