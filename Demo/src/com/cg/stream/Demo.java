package com.cg.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Demo 
{
public static void main(String[] args) 
{
Collection<Integer> listint=Arrays.asList(11,3,44,5,66,33,44);
//listint.stream().filter(num->num>10).forEach(num->System.out.println(num));
//listint.stream().distinct().forEach(System.out :: println);
listint.stream().limit(4).forEach(System.out::println);
//System.out.println(streamOfCollection);

}
}
