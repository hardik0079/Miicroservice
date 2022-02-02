package com.example.demo.com.example.demo;

@FunctionalInterface
public interface Square {
	int calculate(int x);
	
default	int add(int y) {
	return 0;
}
}
