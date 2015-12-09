import java.util.Scanner;


public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String txt = scanner.nextLine();  // tHiS iS tESt
		String array[] =txt.split(" ");
		for(String z : array){
			System.out.print((z.charAt(0)+"").toUpperCase()+z.substring(1).toLowerCase()+" ");
		}

	}

}
