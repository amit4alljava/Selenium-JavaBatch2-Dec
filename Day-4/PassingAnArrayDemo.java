class ArrayDemo
{
	void printArray(int x[]){
		for(int i : x){
		System.out.println("Value is "+i);
		}
		}
}
public class PassingAnArrayDemo {

	public static void main(String[] args) {
		int y[] = {10,20,30};
		ArrayDemo demo = new ArrayDemo();
		demo.printArray(y);

	}

}
