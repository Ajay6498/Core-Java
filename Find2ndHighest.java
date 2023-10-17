package test.collection;

public class Find2ndHighest {

	public static void main(String[] args) {
		 int[] Arr= {1,4,3,7,5,88,98,55,0};
		 int Temp;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = i+1; j < Arr.length; j++) {
				if(Arr[i]<Arr[j]) {
					Temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=Temp;
				}
			}
		}	
		 System.out.println(Arr[1]);
	}

}
