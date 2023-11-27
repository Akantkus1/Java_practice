package com.cg.practice;

import java.util.Scanner;

public class ExceptionHndler 
{
public static void main(String[] args) {
	System.out.println("Connection Establised");
	Scanner scan=new Scanner(System.in);
	try {
		System.out.println("Please enter 1st no");
		int a=scan.nextInt();
		System.out.println("Please enter 2nd no");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("Exception was handled");
	}
	System.out.println("Connection terminated");
}
}
