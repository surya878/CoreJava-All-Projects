package com.predicate.examples;

import java.util.function.Predicate;

public class PredicateEx_01 {

	//Before java 1.8v
	/*
	
	public boolean test(int i) {
		if (i > 10) {
			return true;
		} else {
			return false;
		}

	}
*/
	public static void main(String[] args) {

		Predicate<Integer> pd = i -> i > 10;

		pd.test(4);
		System.out.println(pd.test(4));
		System.out.println(pd.test(41));
	}

}
