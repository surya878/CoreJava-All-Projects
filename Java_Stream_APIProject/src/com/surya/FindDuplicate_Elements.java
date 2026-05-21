package com.surya;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;

public class FindDuplicate_Elements {

	public static void main(String[] args) {
		
		/*
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);
		
		 * Set<Integer> duplicates = list.stream() .filter(n ->
		 * Collections.frequency(list, n) > 1) .collect(Collectors.toSet());
		 * 
		 * System.out.println(duplicates);
		 */
		
		//or
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);
		Set<Integer> set01= new HashSet<>();
		
		Set<Integer> duplicate=list.stream()
					.filter(n -> !set01.add(n))
					.collect(Collectors.toSet());
		System.out.println(duplicate);
		
}
	
}
