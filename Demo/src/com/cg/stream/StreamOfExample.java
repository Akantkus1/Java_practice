package com.cg.stream;

import java.util.stream.Stream;

public class StreamOfExample 
{
public static void main(String[] args) {
	
	Stream<String> stringStream=Stream.of("Apple", "Mango","Orange","Banana");
	stringStream.filter(s-> s.startsWith("A")).forEach(System.out::println);;
	
	
}
}