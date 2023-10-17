package test.collection;

public class Find1stHighest {
public static void main(String[] args) {
	 int[] Arr= {1,4,3,7,5,88,98,55,0};
	 int max=Arr[0];
	 for (int i = 0; i < Arr.length; i++) {
		 if(Arr[i]>max) {
			 max=Arr[i];
		 }
	}
	 System.out.println(max);
}
}
