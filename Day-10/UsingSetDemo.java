import java.util.TreeSet;


public class UsingSetDemo {

	public static void main(String[] args) {
		// No Duplicate + It is UnOrder
		//HashSet<String> songset = new HashSet<>();
		// No Duplicate + Ordered (Insertion Order)
		//LinkedHashSet<String> songset =new LinkedHashSet<>();
		// No Duplicate + Sorted
		TreeSet<String> songset = new TreeSet<>(); 
		songset.add("bang bang");
		songset.add("bang bang");
		songset.add("bang bang");
		songset.add("boom boom");
		songset.add("boom boom");
		songset.add("angel Dreams");
		songset.add("dangerous");
		songset.add("dangerous");
		songset.add("it's My Life");
		songset.add("angel Dreams");
		songset.add("it's My Life");
		System.out.println(songset);
	}

}
