interface W
{
	void show();
}
class W1 implements W
{
	public void show(){
		System.out.println("w1 show call");
	}
}

class R1  
{
	interface T{
		void show();
	}
	// Method Local inner class
	void show(){
		// RR will be load in Lazy Way
		
		class RR 
		{
			void disp(){
				
			}
		}
		RR obj = new RR();
		obj.disp();
	}
}

class Emp
{
	class LibCard{
	
	}
	class SavingAccount{
		
	}
	class Cab{
		
	}
}

class E // Outer class
{
	static class  T
	{
		
	}
	interface R  
	{
		void show();
	}
	private int s; // member of a class
	// Inner class (it is just a member
	private class D implements R  // member of a class
	{
		public void show(){
			System.out.println("D Show");
		}
	}
}
public class Demo1 {

	public static void main(String[] args) {
		

	}

}
