package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Chikoo");
		list.add("DryFruits");
		list.add("Banana"); //duplicates allowed
		
		System.out.println("List: "+list);
		System.out.println("Element at index 1: "+list.get(2));
	}

}
