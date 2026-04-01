package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set s= new HashSet();
		s.add("Pink");
		s.add("Orange");
		s.add("yellow");
		s.add("White");
		s.add("Black");
		System.out.println(s);
		
		Iterator it= s.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(s);
		
	}

}
