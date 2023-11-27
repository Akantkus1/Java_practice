package com.cg.stringprg;
//Mutable strings
public class StringDemo2 
{
public static void main(String[] args) {
	
	//StringBuffer sb=new StringBuffer("Deep");
	StringBuilder sb=new StringBuilder("Deep");
	System.out.println(sb);
	sb.append("Java");
	System.out.println(sb);
}
}
