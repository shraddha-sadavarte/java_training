package collections;

import java.util.*;

public class treeset_hashmap {
	public static void main(String[]args) {
		TreeSet<String> tree=new TreeSet<>();
		
		tree.add("computer");
		tree.add("pc");
		tree.add("laptop");
		tree.add("Keyboard");
		
		System.out.println("TreeSet: "+tree);
		System.out.println(tree.clone());
		System.out.println(tree.first());
		System.out.println(tree.ceiling("computer"));
		System.out.println(tree.floor("pc"));
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Pritee");
		map.put(2, "Shruti");
		map.put(3, "Pratiksha");
		map.put(4, "Priya");
		
		System.out.println("Map: "+map);
		System.out.println(map.isEmpty());
		
		
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("Hiii", "Hello");
		tm.put("Good morning", "Good night");
		
		System.out.println("TreeMap: "+tm);
		System.out.println(tm.descendingKeySet());
	}

}
