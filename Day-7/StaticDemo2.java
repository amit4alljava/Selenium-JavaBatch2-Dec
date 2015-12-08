class ITAccount
{
	private int accountNo;
	private String holderName;
	//private int age;
	 int age;
	//private static String bankName="HDFC";
	static String bankName="HDFC";
	ITAccount(int accountNo , String holderName, int age){
		//this.bankName = "HDFC";
		if(accountNo>0 && age>0){
			this.accountNo = accountNo;
			this.holderName = holderName;
			this.age = age;
		}
		else{
			System.out.println("Invalid Account No or age");
		}
		
	}
}
public class StaticDemo2 {

	public static void main(String[] args) {
		ITAccount ram = new ITAccount(1001,"Ram",21);
		System.out.println(ram.age);
		System.out.println(ITAccount.bankName);
		
		/*ram.accountNo=-1001;
		ram.age = -99;*/
		
		ITAccount mike =new ITAccount(1002,"Mike",22);
		/*mike.accountNo= 1002;
		mike.age=21;*/
		

	}

}
