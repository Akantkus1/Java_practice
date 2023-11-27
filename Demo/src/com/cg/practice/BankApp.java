package com.cg.practice;

import java.util.Scanner;

public class BankApp 
{
public static void main(String[] args) 
{
Scanner scan=new Scanner(System.in);
Bank b=new Bank();
System.out.println("Please enter amount to deposit");
int dep=scan.nextInt();
b.setBal(dep);
System.out.println("Original balance "+b.getBal());
System.out.println("Please enter amount to withdraw");
int w=scan.nextInt();
int upd_bal=b.getBal()-w;
b.setBal(upd_bal);
System.out.println("Updated balance after withdrwal: "+b.getBal());
}
}
class Bank
{
	private int bal;
	private int pin=9999;
	public void setBal(int b)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter pin");
		int x=scan.nextInt();
		if(x==pin)
		{
			bal=b;
		}
		else {
			System.out.println("Wrong pin");
			System.exit(0);
		}
	}
	public int getBal()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter pin");
		int x=scan.nextInt();
		if(x==pin)
		{
			return bal;
		}
		else
		{
			System.out.println("Wrong pin");
			System.exit(0);
		}
		return 0;
	}
}