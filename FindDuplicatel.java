package test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Find duplicate by using lambda 
public class FindDuplicatel {

	public static void main(String[] args) {
 		List< Integer> ll=Arrays.asList(1,1,2,34,5,4,4,34,7,89,8);
		 ll.stream().filter(t-> Collections.frequency(ll, t)>1).
		 collect(Collectors.toSet()).forEach(t->System.out.println(t));
 	}

}
