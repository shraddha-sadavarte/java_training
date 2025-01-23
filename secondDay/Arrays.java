package secondDay;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []marks=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for 10 students: ");
		for(int i=0;i<10;i++) {
			System.out.println("Enter the marks for "+(i+1)+" student: ");
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Marks that are grater than 60: ");
		
		for(int i=0;i<10;i++) {
			if(marks[i]>60) {
				System.out.println(marks[i]);
			}
		}
		
		
	}

}
