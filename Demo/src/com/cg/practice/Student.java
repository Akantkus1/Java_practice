package com.cg.practice;

public class Student
{
public static void main(String[] args) 
{
	StudentApp s1=new StudentApp();
	System.out.println("student details before allocating values");
	System.out.println(s1.name);
	System.out.println(s1.age);
	
	System.out.println("Student details after allocating values");
	s1.name="Abhijeet";
	s1.age=25;
	System.out.println(s1.name);
	System.out.println(s1.age);
}
}

class StudentApp
{
	String name;
	int age;
	void Studyjava()
	{
		System.out.println("Studtent is studing");
	}
}

