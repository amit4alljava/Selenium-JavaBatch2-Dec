// String Objects are Immutable

public class StringDemo3 {

	public static void main(String[] args) {
		String a = "amit";
		String b = "amit";
		if(a==b){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		a = "ram";
		if(a==b){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}

	}

}
