package com.cg.stringprg;

public class StringDemo 
{
public static void main(String[] args) {
	
	String s1="Abhijeet";
//	String s2="Abhijeet";
	// String s1=new String("Abhi");
	String s2=new String("Abhi");
	if(s1==s2)
	{
		System.out.println("Reference are equals");
	}
	else
	{
		System.out.println("Reference are not equal");
	}
	if(s1.equals(s2))
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("String are not equals");
	}
}
}
