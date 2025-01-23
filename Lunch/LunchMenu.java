package Lunch;

import java.util.Scanner;

public class LunchMenu {
	int cost;
	String dish;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dish for lunch: ");
		dish=sc.next();
		System.out.println("Enter the cost of dish: ");
		cost=sc.nextInt();
		
	}
	
	public void display() {
		System.out.println("For "+dish+" cost is:"+cost);
	}

}
