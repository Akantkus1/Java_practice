package com.cg.practice;

import java.util.Scanner;

public class ArrayDemo 
{
public static void main(String[] args) 
{
int arr[][]=new int[3][];
 arr[0]=new int[4];
 arr[1]=new int[2];
 arr[2]=new int[3];
 Scanner scan=new Scanner(System.in);
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr[i].length-1;j++)
	 {
		 System.out.println("Please enter makrs for class " + i +" student " +j);
		 arr[i][j]=scan.nextInt();
	 }
 }
 System.out.println("Marks of student: ");
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr[i].length-1;j++)
	 {
		 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
 }	
}	
}
