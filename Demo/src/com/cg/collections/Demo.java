package com.cg.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo 
{
public static void main(String[] args) {
	ArrayList  a=new ArrayList();
	a.add(10);
	a.add(10);
	a.add("Abhijeet");
	a.set(2,999);
	System.out.println(a);
	ArrayList al2=new ArrayList();
	al2.add(10);
	al2.add(20);
	al2.add(30);
	al2.add(40);
	al2.add(50);
	System.out.println("2nd Array list " +al2);
	System.out.println(al2.subList(1, 3));
	System.out.println(al2.get(2));
	System.out.println(al2.indexOf(50));
	System.out.println(al2.contains(60));
	System.out.println(al2.contains(50));
	System.out.println(a.containsAll(al2));
	System.out.println(al2.containsAll(a));
	al2.remove(4);
	System.out.println(al2);
	al2.remove(new Integer(40));
	System.out.println(al2);
	a.clear();
	System.out.println(a);
	al2.clear();
	System.out.println(al2);
	
	TreeSet t=new TreeSet();
	t.add("virat");
	t.add("rohit");
	t.add("dhoni");
	t.add("abhi");
	t.add("pant");
	System.out.println(t);
	
// Hashset does not preserved the order of inserations.
	HashSet ah=new HashSet();
	ah.add(56);
	ah.add(66);
	ah.add(44);
	ah.add(33);
	System.out.println(ah);
	
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
	System.out.println();
// For each loop / enchanced for loop
	int [] a2= {10,20,30,40,50};
	for(int x:a2)
	{
		System.out.println(x);
	}
	
}
}
