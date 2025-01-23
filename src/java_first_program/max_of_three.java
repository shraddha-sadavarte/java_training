package java_first_program;

import java.util.Scanner;

public class max_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=10,b=23,c=12;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter third number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
