package com.predicate.examples;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicate_NameStartingwithA_02 {

	public static void main(String[] args) {

		String[] names = { "anu", "Rasmi", "Anupama", "salon", "Sunny", "Anshi" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}

		}
	}
}
