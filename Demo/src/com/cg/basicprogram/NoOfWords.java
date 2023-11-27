package com.cg.basicprogram;

import java.util.Scanner;

public class NoOfWords 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please type a sentence: ");
	String s=scan.nextLine();
	char c[]=s.toCharArray();
	int space=0;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==' ')
		{
			space++;
		}
	}
	System.out.println("word count="+(space+1));
}
}
