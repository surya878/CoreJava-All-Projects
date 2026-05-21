package com.nt.surya;

public class String_Create_01 {

	public static void main(String[] args) {
		
		//1. Creating Strings
		String s1="Hello";   // String literal (stored in pool)
		String s2=new String("Hi"); // New object in heap
		String s3="Hello";
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
	//	Use case:

		//	Use literals for memory efficiency 
		//	Use new only when needed explicitly
		
		
		//2. Length & Basic Info
		
		String str = "Java";
		System.out.println(str.length()); //4
		
		//Use case: Validate input length (e.g., password length)
		
		//isEmpty() and isBlank() (java 11+)
		
		String s="";
		System.out.println(s.isEmpty()); //true
		
		String s4="   ";
		System.out.println(s4.isBlank()); //true
		
		//Use case: Form validation (empty vs whitespace)
		
		
		
		//3. Character Access
		
		//charAt(int index)
		
		String str01="java";
		System.out.println(str01.charAt(0)); //j
		
		//Use case: Parsing characters (e.g., checking vowels)
		
		
		
		//4. String Comparison
		
		// equals() vs equalsIgnoreCase()
		
		String a="java";
		String b="java";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		//5. compareTo()
		
		String c="java";
		String d="java";
		
		System.out.println(c.compareTo(d));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
