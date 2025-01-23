package Dinner;

import java.util.Scanner;

import Lunch.LunchMenu;

public class DinnerMenu {
	String dish;
	int cost;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dish for dinner: ");
		dish=sc.next();
		System.out.println("Enter the cost of dish: ");
		cost=sc.nextInt();
	}
	
	public void display() {
		System.out.println("For "+dish+" cost is:"+cost);
	}

}
