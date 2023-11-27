package com.cg.controlstructure;

import java.util.Scanner;

public class Demo1 
{
public static void main(String[] args) {
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the no");
		int m=scan.nextInt();
		if(m%2==0)
		{
			if(m%5==0)
			{
				System.out.println("No is even & divisible by 5");
			}
			else
			{
				System.out.println("No is even but not divisible by 5");
			}
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
}
