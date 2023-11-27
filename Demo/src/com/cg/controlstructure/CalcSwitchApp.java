package com.cg.controlstructure;

import java.util.Scanner;

public class CalcSwitchApp 
{
public static void main(String[] args) 
{
Scanner scan=new Scanner(System.in);
System.out.println("Please enter operation you want to perform: 1-add|2-sub|3-multiply|4-divide");
int op=scan.nextInt();
System.out.println("Please enter 1st number:");
int num1=scan.nextInt();
System.out.println("Please enter second number");
int num2=scan.nextInt();
 switch(op)
{
 case 1:
	 System.out.println("Result="+(num1+num2));
	 break;
 case 2:
	 System.out.println("Result="+(num1-num2));
	 break;
 case 3:
	 System.out.println("Result="+(num1*num2));
	 break;
 case 4:
	 System.out.println("Result="+(num1/num2));
	 break;
	 default:
		 System.out.println("INVALID INPUT");
 }
	
}
}
