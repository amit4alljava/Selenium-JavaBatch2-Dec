 class T
{
	final void disp(){
		
	}
}
class T2 extends T
{
	/*void disp(){
		
	}*/
}


/*final*/ class Loan // Parent Class
{
	final int MAX_EMI = 20;  // Define a Constant
	 void applyForLoan(){
		System.out.println("This is Common Logic for ApplyForLoan...");
	}
	/*final*/ void roi(){
		System.out.println("This is Common ROI 7% Logic...");
		
	}
	void payEmi(int emi){
		if(emi<MAX_EMI){
		System.out.println("Rec EMi from Various Sources....");
		}
		else
		{
			System.out.println("Exceed from MAX EMI....");
		}
	}
}
// Child Class
class HomeLoan extends Loan{
	// We are doing overriding
	@Override
	void roi(){
		System.out.println("HomeLoan ROI 14 % Calculation....");
	}
	void insurance(){
		System.out.println("Insurance Required in HomeLoan...");
	}
}
class AutoLoan extends Loan{
	void roi(){
		System.out.println("Auto Loan ROI 10% Calculation...");
	}
	void notProvideMorgage(){
		System.out.println("No Morgage....");
	}
}
public class IS_ADemo {

	public static void main(String[] args) {
		/*AutoLoan autoLoan = new AutoLoan();
		autoLoan.applyForLoan();
		autoLoan.payEmi();
		autoLoan.roi();
		//autoLoan.autoloanroi();
		autoLoan.notProvideMorgage();*/
		HomeLoan homeloan = new HomeLoan();
		homeloan.applyForLoan();
		//homeloan.payEmi();
		homeloan.roi();
		homeloan.insurance();

	}

}
