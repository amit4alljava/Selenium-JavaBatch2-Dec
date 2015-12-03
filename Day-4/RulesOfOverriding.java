class X
{
	int a,b;
}
class XPlus extends X
{
	int c ,d;
}
class A
{
	
	X show(){
		 X obj = new X();
		 obj.a = 100;
		 obj.b = 200;
		System.out.println("This is a A Show");
		return obj;
	}
}
class B extends A
{
	@Override 
	XPlus show(){
		XPlus obj = new XPlus();
		obj.a = 100;
		obj. b = 200;
		obj.c = 300;
		obj. d= 400;
		System.out.println("This is B Show ");
		return obj;
	}
}

/*class GrandFather
{
	protected void show(){
		System.out.println("Inside A Show");
	}
}
class Father extends GrandFather
{
	@Override
	public void show(){
		System.out.println("Inside B Show");
	}
}
class GrandSon extends Father 
{
	
}*/
public class RulesOfOverriding {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}
