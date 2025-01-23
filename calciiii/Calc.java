package calciiii;

import java.util.Scanner;

public class Calc {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int no1=sc.nextInt();
		
		System.out.println("Enter a second number: ");
		int no2=sc.nextInt();
		
		int ch;
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			Addition add=new Addition();
			add.calculate(no1, no2);
			break;
			
		case 2:
			Subtraction sub=new Subtraction();
			sub.calculate(no1, no2);
			break;
			
		case 3:
			Multiplication mul=new Multiplication();
			mul.calculate(no1, no2);
			break;
			
		case 4:
			Division div=new Division();
			div.calculate(no1, no2);
			break;
			
		case 5:
			System.exit(0);
		}

	}
	
}

