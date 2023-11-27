package com.cg.stringprg;

public class ConcateDemo 
{
public static void main(String[] args) {
	
	String s1="kod";
	String s2="nest";
	//String s3= s1.concat(s2);
	// String s3=s1+s2;   // (when we use + along with string reference the resultant string will get the memory on the non-constant pool)
	String s3="Kod"+"nest"; //(If we use '+' operator along with raw string the resultant string will get the memory on the constant pool)
	String s4="Kodnest";
	
	System.out.println(s1);
    System.out.println(s3);
    if(s3==s4)
    {
    	System.out.println("Reference are equal");
    }
    else
    {
    	System.out.println("Reference are not equal");
    }
    
    
}
}
