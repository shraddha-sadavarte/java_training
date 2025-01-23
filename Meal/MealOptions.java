package Meal;
import Lunch.LunchMenu;

import java.util.Scanner;

import Dinner.DinnerMenu;

public class MealOptions {

	public static void main(String[] args) {
		
		String userChoice = "";

		do {
		System.out.println("Choose the options from following: ");
		System.out.println("1.Lunch \n2.Dinner");
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		if(ch==1) {
			LunchMenu lm=new LunchMenu();
			lm.accept();
			lm.display();
		}
		else {
			DinnerMenu dm=new DinnerMenu();
			dm.accept();
			dm.display();
		}
		}while(userChoice.equalsIgnoreCase("yes"));
		
	}

}
