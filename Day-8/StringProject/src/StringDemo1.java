/*
 * 1. String - String is a collection of characters
 * e.g. String a = "amit" ; 
 * char x = 'a'; // it represent single character
 * 2. String is a class in Java
 * 3. String is a final class in Java
 * 4. String objects store in a String Pool
 */

public class StringDemo1 {

	public static void main(String[] args) {
		// it will first check amit is in the pool or not
		// if it is not in the pool , it will create the new object in pool
		// otherwise it will refer to the existing one
		String a = "amit"; // 1 object is create 
		// this is String literal
		// It will create 1 or 0 object
		String b = "amit";  // 0 object is create
		if(a==b){  // this will check the reference of a and b not the value
			System.out.println("Same Reference");
		}
		else
		{
			System.out.println("Not Same Reference...");
		}
		
		// For Compare the Value
		if(a.equals(b)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same value");
		}
		
		
		// ***************************************
		int a1 = 100; // a1 has value (100)
		int b1 = a1;  // so a1 value get copy into b1
		
		// x1 has a reference (address) of big string  
		String x1 = "hello gdgdfgfdgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgg"; 
		String y1 = x1;  // x1 reference assign to y1
		// so both are pointing to the same address (reference)
		
		
		
		// What is Literal
		/*int x = 100; 
		float w = 90.20f;
		String w1 = "hello"; 
		*/
		

	}

}
