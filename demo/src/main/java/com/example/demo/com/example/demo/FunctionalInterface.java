package com.example.demo.com.example.demo;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Java program to demonstrate lambda expressions to
//implement a user defined functional interface.


class Test{
	
	
	
	
	
	public static void main(String args[])
	{
		
		
		Square s1 = (int x)-> x+5;
		
		System.out.println(s1.calculate(5));  
		
		
		
		List<String> list = new ArrayList<>();
		
		list.add("hardik");
		list.add("mona");
		list.add("chaman");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println("----------------");
		
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		
		System.out.println("----------------");
		
		
		
		
		list.forEach(System.out::println);
		
		
		
		    List<Integer> list1=List.of(3,4,5,67,7);
		    
		    
		  // List <String> list2= list1.stream().filter(l->l.contains("o")).collect(Collectors.toList());
		    
		   // System.out.println("list-->2"+list2);
		    
		//  List<Integer> t=  list1.stream().map(l2->l2+10).collect(Collectors.toMap);
		    
		  
		  Map<Object, Object> namesMap = list1.stream().distinct()
                  .collect(Collectors.toMap(s -> s, s -> s));

		  
		  
		  
		System.out.println("List 3-->"+namesMap);
		
	
 }
}

