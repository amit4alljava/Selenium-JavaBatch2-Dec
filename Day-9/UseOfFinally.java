class DB
{
	static void connect(){
		try{
		System.out.println("Get the Connection Information");
		//int x [] = new int[10];
		//x[11] = 999;
		if(10>2){
			System.exit(0);
			//return ;
		}
		System.out.println("Processing in the DB");
		}
		finally{
		System.out.println("Close the Connection");
		}
		}
	
}

public class UseOfFinally {

	public static void main(String[] args) {
		DB.connect();

	}

}
