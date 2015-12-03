class X1
{
	int a = 100;  // parent class a
	void show(){
		System.out.println("X1 Show");
	}
}
class Y extends X1
{
	int a = 200;  // Child Class a
	Y(int a){  // local var
		System.out.println(super.a + this.a + a);
	}
	@Override
	void show(){
		super.show();
		System.out.println("Y Show ");
	}
}
public class UseOfSuperAndThis {

	public static void main(String[] args) {
	 Y obj = new Y(900);
	 obj.show();
	 

	}

}
