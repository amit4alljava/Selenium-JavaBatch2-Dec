import java.util.Scanner;


public class UseOfFinalDemo {

	public static void main(String[] args) {
		final int MIN_AGE = 16;
		System.out.println("Enter the Age ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age>=MIN_AGE){
			System.out.println("U Can Apply For VoterId Card");
		}
		else
		{
			System.out.println("U Can't Apply for VoterId Card");
		}
		
		if(age>=MIN_AGE){
			System.out.println("U Can Apply for Driving License");
		}
		else
		{
			System.out.println("U can't Apply for D.L");
		}
		//MIN_AGE++;
		//MIN_AGE= 22;
		scanner.close();

	}

}
