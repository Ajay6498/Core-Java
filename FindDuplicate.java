package test.collection;

public class FindDuplicate {
public static void main(String[] args) {
	int Arr[]= {1,6,8,2,4,2,9,1,8};
 
	for (int i = 0; i < Arr.length; i++) {
		for (int j = i+1; j < Arr.length; j++) {
			if(Arr[i]==Arr[j]) {
				System.out.println(Arr[j]);
			}
		}
	}
}
}
