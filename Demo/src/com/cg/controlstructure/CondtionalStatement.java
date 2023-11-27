package com.cg.controlstructure;

import java.util.Scanner;

public class CondtionalStatement 
{
public static void main(String[] args) 
{
Scanner scan=new Scanner(System.in);
System.out.println("Please enter a number");
int n=scan.nextInt();
if(n%2==0)
{
	System.out.println("Even no");
}
else
{
	System.out.println("Odd no");
}
}
	
}
