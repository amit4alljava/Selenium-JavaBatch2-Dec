import java.util.Scanner;


public class OrderBookingSystem {

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("1. Pizza Order");
			System.out.println("2. Soft Drink Order");
			System.out.println("3. Burger Order");
			System.out.println("Enter your Choice Press 0 to exit");
			choice = scanner.nextInt();
			switch(choice){
			default:
				System.out.println("Wrong Choice...");
				break;
			case 1 :
				System.out.println("Thanks For Ordering Pizza Bill is rs 299");
				break;
			case 2:
				System.out.println("Thanks For Ordering Soft Drink Bill is rs 50");
				break;
			case 3:
				System.out.println("Thanks For Ordering Burger Bill is rs 99");
				break;
			
			}
			
		}while(choice!=0); // only exit when choice is 0

	}

}
