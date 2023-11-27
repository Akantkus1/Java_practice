package com.cg.ipout;

public class AdderApp 
{
	public static void main(String[] args) {
		Adder obj=new Adder();
		int res=obj.add(20,10);
		System.out.println(res);
}
}
class Adder
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	}
