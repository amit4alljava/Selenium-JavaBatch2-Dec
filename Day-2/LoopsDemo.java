
public class LoopsDemo {

	public static void main(String[] args) {
		// 4 types of loop in java
		// 1. while loop
		/*int i = 1; // loop start
		while(i<=20)  // when the condition then it will go inside the loop
		{
			System.out.println(" I is "+i);
			if(i==5)
			{
			i = i + 3;
			}
			else{
			i = i + 2;
			}
			//i--;
			//i++; // i = i + 1
		}*/
		
		// for loop
		/*for(int i = 1; i<=10 ; i++){
			System.out.println("I is "+i);
		}*/
		/*int i = 1;
		for(;i<=10;){
			System.out.println(" i is "+i);
			i++;
		}*/
		int i = 100;
		do{
			System.out.println("It will execute at least once");
		}while(i<=10);  //false
		
	}

}
