package test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdditionofArray {
	public static void main(String[] args) {
		int[] Arr= {1,4,3,7,5,88,98,55,0};
		List<Integer> ll=Arrays.asList(1,4,3,7,5,88,98,55,0);
		int Add=0;
		for (int i = 0; i < Arr.length; i++) {
			Add=Add+Arr[i];
		}
		System.out.println(Add);
		int Add1=0;
		for (Integer integer : ll) {
			Add1=Add1+integer;
		}
		System.out.println(Add);
	}
	

}
