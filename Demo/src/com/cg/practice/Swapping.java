package com.cg.practice;

import java.util.Scanner;

public class Swapping 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=scan.nextInt();
	System.out.println("Please enter second number");
	int b=scan.nextInt();
	System.out.println("values before swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("values after swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
