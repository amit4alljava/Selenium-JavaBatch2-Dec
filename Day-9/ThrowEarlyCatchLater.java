import java.sql.SQLException;

class Flow
{
	void db() throws SQLException{
		System.out.println("DB Connection Open");
		System.out.println("DO Query");
		try{
		if(10>2){
			throw new SQLException();
		}
		
		//int e = 10/0;
		System.out.println("Processing the Query Result");
		}
		finally{
		System.out.println("DB COnnection Close");
		}
		}
	void bl() throws SQLException{
		System.out.println("BL Starts");
		System.out.println("call to the DB ");
		db();
		System.out.println("Process the DB Result...");
		System.out.println("BL Ends");
	}
	void ui(){
		System.out.println("UI Starts");
		System.out.println("UI Call to the BL");
		try{
		bl();
		System.out.println("Show the BL Result on Screen");
		}
		catch(SQLException e){
			System.out.println("Exception Occured handle in UI "+e);
			e.printStackTrace();
		}
		System.out.println("UI Ends");
	}
}
public class ThrowEarlyCatchLater {

	public static void main(String[] args) {
		Flow flow = new Flow();
		flow.ui();

	}

}
