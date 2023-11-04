package com.java;

public class Test7 {
public static void main(String[] args) {
	int x=5;
	{
		int y=6;
		System.out.println(x+""+y);
	}
	//System.out.println(x+""+y);//y cannot resolved
}
}
