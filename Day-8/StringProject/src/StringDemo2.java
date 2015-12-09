
public class StringDemo2 {

	public static void main(String[] args) {
		// Two way to use String 
		// 1. String Literal
		String a = "Hello";   // 1 or 0 
		// 2. Create String Object by Using new
		String b = new String ("bye");  // 2 or 1
		String c = new String("HELLO"); // 1 
		if(a==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		if(a.equalsIgnoreCase(c)){
			System.out.println("Same value");
		}
		else
		{
			System.out.println("Not Same value");
		}

	}

}
