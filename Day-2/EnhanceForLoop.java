
public class EnhanceForLoop {

	public static void main(String[] args) {
		int x = 100; // It hold single value
		int y [] = {10,20,30,40,50,88,66,44,22};
		// Array will take multiple values
		
		/*// Older Way of the Loop
		for(int i = 0; i<y.length; i++){
			System.out.println(y[i]);
		}*/
		/*for(int i = y.length-1 ; i>=0 ; i--){
			System.out.println(y[i]);
		}*/
		// (Java 5) Enhance for Loop (Traverse an Array)
		for(int i : y){
			System.out.println(i);
		}
			
	}

}
