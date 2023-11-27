package com.cg.practice;

import java.util.Scanner;

public class UserInputDemo 
{

public static void main(String[] args) {

	System.out.println("Enter age");
	 
	
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	scan.nextLine();
	System.out.println("Please enter name");
	String s=scan.nextLine(); 
	System.out.println(a);
	System.out.println(s);
	 
//	int arr[]=new int[n];
//	for(int i=1;i<=5;i++)
//	{
//		System.out.println(i);
//	}
	
}
}