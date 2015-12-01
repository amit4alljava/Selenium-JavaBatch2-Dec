import java.util.Scanner;


public class TakeInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		//String  name = scanner.next();
		String name = scanner.nextLine();
		System.out.println("Name is "+name);
		System.out.println("Enter the Gender (m for Male and f for female)");
		char gender = scanner.next().charAt(0);
		System.out.println("Gender is "+gender);
		

	}

}
