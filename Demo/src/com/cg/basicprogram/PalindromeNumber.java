package com.cg.basicprogram;

import java.util.Scanner;

public class PalindromeNumber 
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Palindrome number");
	int n=scan.nextInt();
	int original_no=n;
	int rev=0;
	while(n>0)
	{
		int r=n%10;
		n=n/10;
		rev=(rev*10)+r;
	}
	System.out.println("Original number= "+original_no);
	System.out.println("Reverse number="+rev);
	if(original_no==rev)
	{
		System.out.println("Palindrome");
		
	}
	else
	{
		System.out.println("Not Palidrome");
	}
}
}
