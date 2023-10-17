package test.collection;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int no1 = sc.nextInt();
		System.out.println("Enter 2st number");
		int no2 = sc.nextInt();
		sc.close();
		int add = no1 + no2;
		System.out.println("Addition is" + add);
	}
}

