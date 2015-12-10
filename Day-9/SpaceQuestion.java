import java.util.Scanner;


public class SpaceQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String txt = scanner.next();
		StringBuffer sb = new StringBuffer(txt);
		System.out.println(txt);
		for(int i = 0 ; i<txt.length(); i++){
			char x = sb.charAt(0);
			System.out.println(sb.append(x).deleteCharAt(0));
		}
			
	}

}
