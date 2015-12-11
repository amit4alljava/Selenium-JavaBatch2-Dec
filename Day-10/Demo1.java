import java.util.TreeSet;


public class Demo1 {

	public static void main(String[] args) {
		// TreeSet - java.util.* (Collections)
		// TreeSet - It says No Duplicate Things Allowed + Sorted
		// Generic
		TreeSet<String> songsList = new TreeSet<>(); // Java 7
		//songsList.add(100);
		songsList.add("Bang Bang");
		songsList.add("Bang Bang");
		songsList.add("Bang Bang");
		songsList.add("Boom Boom");
		songsList.add("Angels");
		songsList.add("Boom Boom");
		songsList.add("Angels");
		System.out.println(songsList);

	}

}
