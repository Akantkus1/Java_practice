package com.cg.practice;

public class TendulkarApp 
{
public static void main(String[] args) 
{
Tendulkar ten=new Arjun();
ten.proffession();
ten.role();
((Arjun)(ten)).smoke();  // down casting
}
}
class Tendulkar
{
	void proffession()
	{
		System.out.println("I am a crikerter");
	}
	void role()
	{
		System.out.println("I am a batsman");
	}
}
class Arjun extends Tendulkar
{
	void role()
	{
		System.out.println("I am an all-rounder");
	}
	void smoke()
	{
		System.out.println("I somke sometimes");
	}
}