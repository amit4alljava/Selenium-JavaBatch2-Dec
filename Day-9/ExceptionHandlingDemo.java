import java.util.Scanner;


public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNo = 0;
		int secondNo = 0;
		int result = 0;
		
		System.out.println("Enter the First No");
		firstNo = scanner.nextInt();
		System.out.println("Enter the Second No");
		secondNo = scanner.nextInt();
		try{
			result = firstNo / secondNo; // throw new AritmeticException()
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a Number with Zero "+e);
			System.out.println("Enter the Second No Again");
			secondNo = scanner.nextInt();
			result = firstNo / secondNo;
		}
		finally{
			//Resource Clean Up Block 
			scanner.close();
		}
		
		System.out.println("Result is "+result);
	}

}
