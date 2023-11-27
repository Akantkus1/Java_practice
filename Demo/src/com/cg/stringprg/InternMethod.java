package com.cg.stringprg;

public class InternMethod 
{
public static void main(String[] args) {
	String s=new String("Abhijeet");
	String s1=s.intern();
	String s2=s.intern();
	if(s1==s2)
	{
		System.out.println("Reference is equal");
	}
	else
	{
		System.out.println("Reference is not equal");
	}
}
}
// The intern method takes a copy of the string present on the non-constant pool and move its to the constant pool