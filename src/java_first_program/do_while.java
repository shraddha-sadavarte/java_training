package java_first_program;

import java.util.Scanner;

public class do_while {

	public static void main(String[]args) {
		String userchoice;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println("You have entered a even number");
			}
			else {
				System.out.println("You have entered a odd number");
			}
			
			System.out.println("Do you want to enter a number(yes/no): ");
			userchoice=sc.next();
		}while(userchoice=="yes" || userchoice=="Y");
	}
}
