package com.nt.surya;

public class StringAllMethods_TestCase {

	public static void main(String[] args) {

		// String Core Inspection

		// 1. length() - returns number of characters , "java".length() -> 4

		String slen = "Java";
		int length01 = slen.length();
		System.out.println(length01); // 4

		// 2. charAt(int index) - gets character at position, "java".charAt(0) -> j

		String ch01 = "surya";
		char s1 = ch01.charAt(0); //s
		char s2 = ch01.charAt(4); //a
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		// isEmpty()  True if length == 0 , "".isEmpty() -> true
		
		String empt01="";
		String empt02=" ";
		boolean b= empt01.isEmpty(); //true
		boolean d= empt02.isEmpty(); //false
		
		System.out.println(b);
		System.out.println(d);
		System.out.println("===================");
		
		//4. isBlank() (java 11+) True if empty or only whitespace , "  ".isBlack() -> true
		
		String blk01 = ""; //t
		String blk02 = " "; //t
		String blk03 = "  "; //t
		String blk04 = "       "; //t
		String blk05 = "   dd"; //f
		
		boolean b1= blk01.isBlank();
		boolean b2= blk02.isBlank();
		boolean b3= blk03.isBlank();
		boolean b4= blk04.isBlank();
		boolean b5= blk05.isBlank();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println("===================");
		
		
		
		//2. Searching (indexOf, lastIndexOf, contains, startsWit, EndsWith)
		
			//1. indexOf(String/char)	First occurrence index (or -1)	"Hello".indexOf('l') → 2
		
			//2. lastIndexOf(...)	Last occurrence index	"Hello".lastIndexOf('l') → 3
			
			//3. contains(CharSequence)	True if substring exists	"Hello".contains("ell") → true
		
			//4. startsWith(String)	Prefix check	"Hello".startsWith("He") → true
		
			//5. endsWith(String)	Suffix check	"Hello".endsWith("lo") → true
		
		
			String ind01="Surya";
			int i1=ind01.indexOf('a'); ///4
			System.out.println(i1);
			
			//doubt
			String ind02="Lipu";
			int lastIndexOf = ind02.lastIndexOf('4');
			System.out.println(lastIndexOf);
		
		
		System.out.println("===================");
			
			String con01="Suryakanta";
			String con02= "Mohanty";
			con01.contains("ff"); //f
			con02.contains("moh"); //f
			con01.contains("su"); //f (case-sensitive)
			con01.contains("Su"); //t (case-sensitive)
			
			System.out.println(con01.contains("ff"));
			System.out.println(con02.contains("moh"));
			System.out.println(con01.contains("su"));
			System.out.println(con01.contains("Su"));
			
			System.out.println("===================");
			
			//startsWith(String) - Prefix check , "Hello.startsWith("He)" -> true
			
			String st01="Suryakanta";
			String st02= "Mohanty";
			
			st01.startsWith("su"); //f
			st01.startsWith("Su"); //t
			st02.startsWith("M"); //t
			st02.startsWith("m"); //f
			st02.startsWith("Moh"); //t
			st02.startsWith("Mohanty"); //t
			st02.startsWith("mohanty"); //f
			st02.startsWith("MohanTy"); //f
			
			System.out.println(st01.startsWith("su"));
			System.out.println(st01.startsWith("Su"));
			System.out.println(st02.startsWith("M"));
			System.out.println(st02.startsWith("m"));
			System.out.println(st02.startsWith("Moh"));
			System.out.println(st02.startsWith("Mohanty"));
			System.out.println(st02.startsWith("mohanty"));
			System.out.println(st02.startsWith("MohanTy"));
			
			
			
			
			//endsWith(String)  - Suffix check , "Hello".endsWith("lo") -> true
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
