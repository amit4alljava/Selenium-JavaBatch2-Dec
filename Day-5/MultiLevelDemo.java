class P1
{
	int x= 100;
	P1(){
		System.out.println("P1 Default Cons Call");
	}
	P1(int x){
		System.out.println("P1 Param Cons Call");
	}
}
class P2 extends P1{
	int  x = 200;
	P2(){
		System.out.println("P2 Default Cons Call");
	}
	P2(int x){
		super(11);
		System.out.println("p2 param Cons Call");
	}
}
class P3 extends P2{
	int x = 300;
	P3(){
		System.out.println("P3 Default Cons Call");
	}
	P3(int x){
		super(33);
		int z = ((P1)this).x + super.x + this.x + x;
		System.out.println("P3 Param Cons Call "+z);
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		P3 obj = new P3(10);

	}

}
