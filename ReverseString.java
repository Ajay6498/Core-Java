package test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="MANJUNADHA";
		System.out.println(s );
 		char[]  c=s.toCharArray();
		 
		for (int i = c.length-1;  i >= 0; i--) {
			System.out.print(c[i]);
		}
		
		List<String> ll= Arrays.asList("ajay","vijay","Sanjay");
		System.out.println("\n" +ll);
		Collections.reverse(ll);
		System.out.println(ll);
		
		System.exit(0);
 	//	 List<String> ll= Arrays.asList("ajay","vijay","Sanjay");
//		 Set<Integer> ss=new HashSet<Integer>();
//		 Map<Integer, String> mm=new TreeMap<Integer, String>();
//		 mm.put(1, "ajay");
//		 mm.put(2, "vjay");
//		 mm.put(5, "sjay");
//		 mm.put(3, "sujay");
//		 System.out.println(mm);
//		 ss.add(2);		 
//		 ss.add(5);
//		 ss.add(5);
//		 ss.add(3);
//
//		 
//
//		// Collections.reverse(ss);
//		 System.out.println(ss);
		
		
		

	}

}
