package collections;

import java.util.*;

public class queue_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer>queue=new PriorityQueue<>();
		queue.add(20);
		queue.add(40);
		queue.add(60);
		queue.add(80);
		queue.add(100);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); //retrieve
		}
		
		Stack<Integer>stack=new Stack<>();
		stack.push(89);
		stack.push(56);
		stack.push(24);
		stack.push(90);
		
		System.out.println(stack);
		System.out.println(stack.pop()); //removes last element
	}

}
