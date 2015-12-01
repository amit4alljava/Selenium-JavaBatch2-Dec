import java.util.Scanner;


public class SwitchCaseDemo {

	public static void main(String[] args) {
		final int PIZZA = 1;
		final int SOFT_DRINK = 2;
		final int BURGER =3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Pizza Order");
		System.out.println("2. Soft Drink Order");
		System.out.println("3. Burger Order");
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		
		switch(choice){
		default:
			System.out.println("Wrong Choice...");
			break;
		case PIZZA :
			System.out.println("Thanks For Ordering Pizza Bill is rs 299");
			break;
		case SOFT_DRINK:
			System.out.println("Thanks For Ordering Soft Drink Bill is rs 50");
			break;
		case BURGER:
			System.out.println("Thanks For Ordering Burger Bill is rs 99");
			break;
		
		}
		scanner.close();
		
		/*if(choice == 1){
			System.out.println("Thanks For Ordering Pizza Bill is rs 299");
		}
		else
		if(choice == 2){
				System.out.println("Thanks For Ordering Soft Drink Bill is rs 50");
		}
		else
		if(choice == 3){
			System.out.println("Thanks For Ordering Burger Bill is rs 99");
		}
		else{
			System.out.println("Wrong Choice...");
		}*/
		//  this is single line comment
	
			

	}

}
