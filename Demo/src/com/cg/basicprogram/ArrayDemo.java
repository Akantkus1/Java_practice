package com.cg.basicprogram;
// WAP accept the marks of five student from the user and find the average
import java.util.Scanner;

public class ArrayDemo 
{
void CalcAvg()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter no of student");
	int n=scan.nextInt();
	int marks[]=new int[n];
	for(int i=0;i<=n-1;i++)
	{
		System.out.println("Please enter the marks of student: " +i);
		marks[i]=scan.nextInt();
	}
		int sum=0;
		for( int i=0;i<=n-1;i++)
		{
			sum=sum+marks[i];
		}
		float Avg=sum/(n);
		System.out.println("Average marks =" +Avg);
	}
	public static void main(String[] args)
	{
		ArrayDemo ad=new ArrayDemo();
		ad.CalcAvg();
		
	}
}