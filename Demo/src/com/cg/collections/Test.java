package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test 
{
public static void main(String[] args) {
	Student st1=new Student("Virat",2012,"MECH");
	Student st2=new Student("Rohit", 2015,"CSE");
	Student st3=new Student("Anushka",2011,"ECE");
	ArrayList al=new ArrayList();
	al.add(st1);
	al.add(st2);
	al.add(st3);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}

class Student implements Comparable
{

	String name;
	int yop;
	String branch;
	public Student(String name, int yop, String branch) {
		super();
		this.name = name;
		this.yop = yop;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", yop=" + yop + ", branch=" + branch + "]";
	}
@Override
public int compareTo(Object ob) {
	
	if(this.yop>((Student)(ob)).yop)  // down casting
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
}