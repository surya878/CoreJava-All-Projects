package com.surya;

interface MyInterfaceOne {
	public void m1();
}

public class MyApp implements MyInterfaceOne {

	@Override
	public void m1() {

		System.out.println("m1 method");

	}

	public static void main(String[] args) {
		MyApp mm = new MyApp();
		mm.m1();
	}

}
