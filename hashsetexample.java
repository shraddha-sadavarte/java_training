package collections;

import java.util.HashSet;
import java.util.Set;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
		set.add("Pen");
		set.add("Pencil");
		set.add("Rubber");
		set.add("Book");
		set.add("Notebook");
		set.add("Pen"); //duplicates ignored
		
		System.out.println("Set: "+set);
		System.out.println(set.contains("Rubber"));
		Set<String>set1=new HashSet<>();
		set1.add("Eraser");
		set1.add("Pouch");
		System.out.println(set.addAll(set1));
		System.out.println("New updated set is: "+set);
	}

}
