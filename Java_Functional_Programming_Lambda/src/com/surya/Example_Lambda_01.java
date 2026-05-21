package com.surya;

public class Example_Lambda_01 {

	public static void main(String[] args) {

		// method - 01

		/*
		 * public void m1() { System.out.println("Hi"); }
		 */

		// By using Lambda

		Runnable r = () -> System.out.println("Hi");
		System.out.println(r);

	}
}