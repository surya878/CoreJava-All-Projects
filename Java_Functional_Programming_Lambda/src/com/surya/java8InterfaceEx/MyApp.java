package com.surya.java8InterfaceEx;

@FunctionalInterface
interface MyAppInterface {

	public void m1();
}

class MyApp implements MyAppInterface {

	@Override
	public void m1() {
		System.out.println("m1 method called....");

	}

	public static void main(String[] args) {
		MyApp app = new MyApp();
		app.m1();
	}
}