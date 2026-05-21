package com.surya.java8InterfaceEx;

@FunctionalInterface
interface myInterfaceTwo {
	public void m1();
}

// By using OOP , before java 8 means 1.7v below

/*
 * public class MyAppTwo implements myInterfaceTwo {
 * 
 * @Override public void m1() { System.out.println("m1 method called.....");
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * MyAppTwo app2 = new MyAppTwo(); app2.m1(); }
 */

// By using Java 8 Lambda Expression

public class MyAppTwo {
	public static void main(String[] args) {
		myInterfaceTwo mt = () -> System.out.println("m1 method called....");
		mt.m1();
	}
}
