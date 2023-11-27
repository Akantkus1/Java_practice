package com.cg.controlstructure;

import java.util.Scanner;

public class CalcApp 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter operation you want to perform: 1-add|2-sub|3-multiply|4-divide");
	int op=scan.nextInt();
	System.out.println("Please enter 1st no");
	int num1=scan.nextInt();
	System.out.println("Please enter 2nd no");
	int num2=scan.nextInt();
	if(op==1)
	{
		System.out.println("Result="+(num1+num2));
	}
	else if(op==2)
	{
		System.out.println("Result="+(num1-num2));
	}
	else if(op==3)
	{
		System.out.println("Result="+(num1*num2));
	}
	else if(op==4)
	{
		System.out.println("Result="+(num1/num2));
	}
	else {
		System.out.println("Invalid input");
	}
}
}
