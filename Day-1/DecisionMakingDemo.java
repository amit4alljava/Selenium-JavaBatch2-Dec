// Decision Making
//import java.lang.*; this is optional to write
import java.util.Scanner;

class DecisionMakingDemo
{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
//char w = scanner.next().charAt(0);  // "Amit"
System.out.println("Enter the First Number ");
int firstNumber = scanner.nextInt();
System.out.println("Enter the Second Number ");
int secondNumber = scanner.nextInt();
System.out.println("Enter the Third Number ");
int thirdNumber = scanner.nextInt();
//int firstNumber = Integer.parseInt(args[0]);
//int secondNumber = Integer.parseInt(args[1]);
//int thirdNumber = Integer.parseInt(args[2]);
if(firstNumber>secondNumber && firstNumber>thirdNumber)  // true
{
 System.out.println("First Number is Greater ");
} // if ends
else
if(secondNumber>firstNumber && secondNumber>thirdNumber){
System.out.println("Second Number is Greater ");	
}
else
if(thirdNumber>firstNumber && thirdNumber>secondNumber){
System.out.println("Third Number is Greater ");	
}

}
}
