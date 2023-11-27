package com.cg.stringprg;

import java.util.Scanner;

public class StudentApp 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter name");
	String n=scan.nextLine();
	System.out.println("Please enter age");
	int a=scan.nextInt();
	Student s=new Student(n,a);
	System.out.println("Name:"+s.getName());
	System.out.println("Age: "+s.getAge());
}
}
class Student
{
	private String name;
	private int age;
	public Student(String n, int a)
	{
		name=n;
		age=a;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	
}