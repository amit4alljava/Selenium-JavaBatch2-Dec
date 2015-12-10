
public class StringBufferDemo {

	public static void main(String[] args) {
		//String x = "amit";
		// Java 5 
		StringBuilder sb = new StringBuilder("hello");
		// Legacy Class
		//StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String e = "Hi";
		sb.append(e);
		int t = 900;
		sb.append(t);
		//sb.append(" how are you");
		//sb.insert(0, "Hi");  // 0th Index
		//System.out.println(sb);
		//sb.delete(2, 4);
		//sb.deleteCharAt(0);
		sb.reverse();
		String x = sb.toString();  // It will convert StringBuffer into String 
		sb.ensureCapacity(2000);
		System.out.println(sb);
		/*sb.append("ghdfkjghkfdhggkdhkghdkhgdhgkhghkhgkdhg"
				+ "gjdfkgldfjgjdjgldfgjdfjgldlgdfglfdjjfdlkdfhgkhdgkdhgk");
		*/System.out.println(sb.length());
		System.out.println(sb.capacity());
		// if(newCapacity<length){ 
		// newCapacity = length; }
		// NewCapacity = oldCapacity * 2 + 2
		//         42    = 20    * 2    + 2   

	}

}
