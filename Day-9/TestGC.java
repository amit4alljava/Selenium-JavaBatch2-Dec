class Emp1
{
	Emp1(){
		System.out.println("Emp Object is Created...");
	}
	@Override
	protected void finalize(){
		System.out.println("Emp Gone...");
	}
}
public class TestGC {

	public static void main(String[] args) {
		Emp1 ram =new Emp1();
		ram = null;
		System.gc();
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}

	}

}
