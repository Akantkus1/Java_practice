package com.cg.stringprg;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
public static void main(String[] args) {
	String A="Kodnest teaches java";
	StringTokenizer st=new StringTokenizer(A, "");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
