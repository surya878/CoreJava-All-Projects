package com.surya;

import java.util.Arrays;
import java.util.List;

public class OverAList_02 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * List<String> s1 = Arrays.asList("Basudev", "googly", "Surya", "Lipsa");
	 * 
	 * for (int i = 0; i < s1.size(); i++) {
	 * 
	 * System.out.println(s1.get(i)); } }
	 */

	public static void main(String[] args) {
		
		List<String> s1 = Arrays.asList("Basudev", "googly", "Surya", "Lipsa");
	
		for(String s : s1) {
			System.out.println(s);
		}
	}
}
