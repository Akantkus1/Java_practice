package com.cg.basicprogram;
// print the maximum value present in an array..
import java.util.Scanner;

public class ClassArrayDemo 
{
void findMax()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter size of array");
	int n=scan.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<=n-1;i++)
	{
		System.out.println("Please enter element for index: "+i);
		arr[i]=scan.nextInt();
	}
	int max=arr[0];
	for(int i=1;i<=n-1;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("max element="+max);
}
public static void main(String[] args) {
	ClassArrayDemo ad=new ClassArrayDemo();
	ad.findMax();
}
}
