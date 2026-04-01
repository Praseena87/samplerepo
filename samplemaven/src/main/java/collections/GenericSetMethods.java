package collections;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		
		//1. add()
	
		s.add("Yellow");
		s.add("Blue");
		s.add("Red");
		s.add("Pink");
		
		//2. addAll()
		
		Set<String> s1= new HashSet<String>();
		s1.add("Green");
		s1.add("Black");
		
		s.addAll(s1);// add all the elements of s1 to s
		System.out.println(s);
		System.out.println(s1);
		
		//3.contains()
		
		System.out.println(s.contains("Blue"));
		
		//4.containsAll()-- used to cjeck whether all the elements of one set is contained in another set
		
		System.out.println(s1.containsAll(s));
		System.out.println(s);
		
		//5.isEmpty()
		
		System.out.println(s.isEmpty());
		
		//6.remove()
		
		s.remove("Pink");
		System.out.println(s);
		
		//7.removeAll()
		
		s.removeAll(s1);
		System.out.println(s);
		
		//8.size()
		System.out.println(s.size());
		System.out.println(s1.size());
		
		//clear()--- to delete all the elements but the structure remains
		s1.clear();
		System.out.println(s1);
		
		
		
	}

}
