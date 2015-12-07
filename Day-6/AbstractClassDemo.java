// abstract class is used to restrict the object creation of your class
// it is always acting as a parent class
// and it is used through inheritance

// 2. you can have abstract methods and these methods has to define
// by the child class and if child class not define this method
// child class become abstract
abstract class Account{
	void deposit(){
		System.out.println("Account Class Deposit Function...");
	}
	void withDraw(){
		System.out.println("Account Class WithDraw Function...");
	}
	abstract void roi(); // declare a method
}
class SavingAccount extends Account{
	void debitCard(){
		System.out.println("Saving Account Debit Card...");
	}
	// Define a method
	@Override
	void roi(){
		System.out.println("Saving Account Bank will pay the ROI");
	}
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("Current Account Bank will charge the ROI");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.roi();
		CurrentAccount ca = new CurrentAccount();
		//Account sa = new Account();
		ca.deposit();
		ca.withDraw();
		ca.roi();

	}

}
