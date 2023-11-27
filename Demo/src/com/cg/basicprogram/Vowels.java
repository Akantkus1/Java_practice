package com.cg.basicprogram;

public class Vowels 
{
public static void main(String[] args) {
	String str="Hello 4m g@laxy d3ar Humans!";
	str =str.toLowerCase();
	int v=0,c=0,s=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a' && ch<='z')
		{
			if(ch=='a'|| ch=='e'||ch=='o'|| ch=='u')
			{
				v++;  //vowels
			}
			else {
				c++;    // consonant
 			}
		}
		else {
			s++;    //special character
		}
	}
	System.out.println("vowel count=" +v);
	System.out.println("consonant count= "+c);
	System.out.println("Special character count="+s);
}
}
