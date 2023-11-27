package com.cg.practice;

import java.util.Scanner;

public class CopyArray 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter size of array");
	int m=scan.nextInt();
	int a[]=new int[m];
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Please enter element of index: " +i);
		a[i]=scan.nextInt();
	}
	int b[]=new int[a.length];
	for(int i=0;i<=a.length-1;i++)
	{
		b[i]=a[i];
	}
	System.out.println("Element of array 1st array");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("Element of array 2nd array");
	for(int i=0;i<=b.length-1;i++)
	{
		System.out.println(b[i]);
	}
}
}

/* copy Data of one array into another array in reverser direction. 

logic in reverser order..
int j=n-1;
for(int i=0;i<=n-1;i++)
{
b[i]=a[j];
j--;

*/


		
		