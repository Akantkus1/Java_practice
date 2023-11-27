package com.cg.basicprogram;

public class StringDemo 
{
public static void main(String[] args) {
	String s="banana";
	char []a=s.toCharArray();
	char []b=new char[a.length];
	int idx=0;
	for(int i=0;i<a.length;i++)
	{
		boolean isPresent=false;
		char temp=a[i];
		for(int j=0;j<b.length;j++)
		{
			if(temp==b[j])
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent==false)
		{
			b[idx]=temp;
		idx++;
		}
	}
	for(int i=0;i<idx;i++)
	{
		System.out.print(b[i]);
	}
	
}
}
