package com.java;

public class Test6 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < 10; ++i) {
			arr[i] = i / 2;
			arr[i]++;
			System.out.println(arr[i] + "");
			i++;
		}
	}
}
