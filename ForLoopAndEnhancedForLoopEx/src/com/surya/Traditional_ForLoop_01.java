package com.surya;

public class Traditional_ForLoop_01 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Interating over an array
	 * 
	 * int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	 * 
	 * for (int i = 1; i < num.length; i++) {
	 * 
	 * System.out.println(i); } }
	 */

	// or

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : num) {
			System.out.println(i);
		}
	}
}
