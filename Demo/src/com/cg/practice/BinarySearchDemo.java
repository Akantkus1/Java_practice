package com.cg.practice;

import java.util.Scanner;

public class BinarySearchDemo 
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter size of array");
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<=n-1;i++)
	{
		System.out.println("Please enter the element for index: "+i);
		a[i]=scan.nextInt();
	}
	System.out.println("Please enter the key to search");
	int key=scan.nextInt();
	
	boolean found=false;
	int idx=0;
	int low=0;
	int high=n-1;
	int mid=(low+high)/2;
	while(low<=high)
	{
		if(key==a[mid])
		{
			found=true;
			idx=mid;
			break;
		}
		else if(key>a[mid])
		{
			low=mid+1;
			mid = (low+high)/2;
		}
		else if(key<a[mid])
		{
			high=mid-1;
			mid=(low+high)/2;
		}
	}
	if(found==true)
	{
		System.out.println(key+"found at index: "+idx);
	}
	else {
		System.out.println("Key not found");
	}
}
}
