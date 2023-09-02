import java.util.Scanner;

public class UpperToLower {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Uppercase String : ");
		String str   = sc.nextLine();
		String str2 = str.toLowerCase();	
		System.out.println("\nThe Lowercase String  =  " + str2);
	}
}