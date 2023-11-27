package com.cg.practice;

import java.util.Scanner;

public class LinearSearch 
{
public static void main(String[] args) 
{

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter size of array");
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<=n-1;i++)
	{
		System.out.println("Please enter element for index " +i);
		a[i]=scan.nextInt();
	}
	System.out.println("Please enter key to search");
	int key=scan.nextInt();
	boolean found=false;
	int idx=0;
	for(int i=0;i<=n-1;i++)
	{
		if(key==a[i])
		{
			found=true;
			idx=i;
			break;
		}
	}
	if(found==true)
	{
		System.out.println(key+"found at index: "+idx);
	}
	if(found==false)
	{
		System.out.println("Key not found ");
	}
}
}
