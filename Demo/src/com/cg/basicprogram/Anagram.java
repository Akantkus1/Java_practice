package com.cg.basicprogram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram 
{
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	if(Arrays.equals(a, b)==true)
	{
		System.out.println("String are anagrams!");
	}
	else
	{
		System.out.println("String are not anagrams!");
	}
}
}
