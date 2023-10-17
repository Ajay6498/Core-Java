package test.collection;

import java.util.Arrays;
import java.util.List;

public class FilterList {
public static void main(String[] args) {
	List< Integer> ll=Arrays.asList(1,1,2,34,5,4,7,89,8);
	 for (Integer integer : ll) {
		if (integer % 2 == 0) {
			System.out.print(integer + " ");
		}
	}
	//Using java8  lambda  
	ll.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	
}

}
