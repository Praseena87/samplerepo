package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		
		ArrayList <String> s=new ArrayList<String> ();//generic list interface
		
		//add()-- Add elements to a list
		
		s.add("Orange");
		s.add("Mango");
		s.add("Apple");
		s.add("Mango");
		s.add("Banana");
		s.add("Orange");
		s.add("Pineapple");
		System.out.println(s);
		
		//get()-- Get method is used to get a particular element using index
		
		System.out.println(s.get(4));
		
		//set()-- Set method is used to set a new value at the given index
		
		s.set(3, "Grape");
		System.out.println(s);
		
		//index()-- index method is used to find the first occurrence of an element 
		
		System.out.println(s.indexOf("Orange"));
		
		//lastindexof()--- is used to find the last occurence of an element
		
	    System.out.println(s.lastIndexOf("Orange"));
	    System.out.println(s.lastIndexOf("Pineapple"));
	    
	    //remove()--- remove method is used to remove an element from list, we can remove the element either by index or value
	    
	    s.remove(2);
	    System.out.println(s);
	    s.remove("Grape");
	    System.out.println(s);
	    
	    //contains()---- contains method is used to whether a given element is present or not in the list, result will be boolean
	    
	    System.out.println(s.contains("Orange"));
	    System.out.println(s.contains("Grape"));
	    
	    //isEmpty  ---is used to check whether a list is empty or not
	    System.out.println(s.isEmpty());
	    
	    //size() ---is used to find the size of the list
	    System.out.println(s.size());
	   
	    
	    
	   

	}

}
