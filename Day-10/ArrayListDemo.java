import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		//String names[]  = new String[5];
		// Simple Array - It is not Dynamic , it is static
		// U Need Write a Logic for CRUD Operation
		// Create , Read , Update and Delete
		// Also For Sorting , We Need to Write a Logic
		/*names[0]="amit";
		names[1]="mike";
		names[2]="tom";
		names[3]="kim";
		names[4]="ram";*/
		// 1. Dynamic
		// 2. All CRUD operations already created , we need to call it
		// Sorting Logic Already created, we need to call it
		
		ArrayList<String> nameList = new ArrayList<>();  // 200 +100
		nameList.add("amit");  // add will append at the end
		nameList.add("ram");
		nameList.add("shyam");
		nameList.add("arnav");
		nameList.add(0,"mike");
		
		
		
		System.out.println("After Add "+nameList);
		// Remove
		nameList.remove(0);
		System.out.println("After Remove "+nameList);
		
		// 1st way to search
		/*if(nameList.contains("ram")){
			System.out.println("Found....");
		}
		else
		{
			System.out.println("not found...");
		}*/
		
		// 2nd way to search
		int index = nameList.indexOf("kim");
		if(index!=-1){
			System.out.println("Found.... ");
			//nameList.remove(index);
		}
		else
		{
			System.out.println("Not Found...");
		}
		System.out.println("Before Update "+nameList);
		// Update
		nameList.set(0,"kim");
		System.out.println("After Update "+nameList);
		
		System.out.println("**************************************************");
		// Read operation
		// 1st Way
		/*for(int i = 0; i<nameList.size(); i++){
			System.out.println(nameList.get(i));
		}*/
		// 2nd Way (java 4)
		// It will provide remove during traverse and no need to 
		// specify the start , end , increment
		/*Iterator<String> it = nameList.iterator();
		while(it.hasNext()) // The Element is present in a List or Not
		{
			System.out.println(it.next());  // Give the Element and 
			//it.remove();
			//then move to the Next Element
		}*/
		
		// 3rd Way (java 4)
		// Will Do Forward And BackWard 
		/*ListIterator<String> lt = nameList.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("BackWard.....");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}*/
		
		// 4th Way
		// Java 5 or 1.5 (2007) Enhance for loop
		/*for(String z : nameList){
			System.out.println(z);
			
		}*/
		// 5th Way (Java 8 = 2013)
		nameList.forEach((s)->System.out.println(s));
		Collections.sort(nameList);
		System.out.println("After Sort "+nameList);
		
		
	}

}
