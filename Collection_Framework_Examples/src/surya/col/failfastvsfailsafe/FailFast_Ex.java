package surya.col.failfastvsfailsafe;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class FailFast_Ex {

	public static void main(String[] args) {
		// Fail-Fast Iterator (Most collections)
		List<Integer> list=new ArrayList<>();
		list.add(9);
		list.add(4);
		list.add(6);
		list.add(11);
	
		Iterator<Integer> iterator = list.iterator();
		list.add(55); // Modifying after iterator creation
		try {
		    while(iterator.hasNext()) {
		        System.out.println(iterator.next()); // ConcurrentModificationException
		    }
		} catch(ConcurrentModificationException e) {
		    System.out.println("Fail-fast: Throws exception on concurrent modification");
		}

	}

}
