package surya.col.failfastvsfailsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe_Ex {

	public static void main(String[] args) {
		// Fail-Safe Iterator (Concurrent collections)
		CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
		cowList.add("A");
		cowList.add("B");
		cowList.add("C");

		Iterator<String> safeIterator = cowList.iterator();
		cowList.add("D"); // Modifying after iterator creation
		while(safeIterator.hasNext()) {
		    System.out.println(safeIterator.next()); // No exception, works on snapshot
		}
		// Output: A, B, C (original snapshot, D not included)	

}
}
