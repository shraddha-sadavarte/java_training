package jan28;

import java.util.Scanner;

public class Try_Catch_Block {

	public static void main(String[] args) {
		
		try {
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value for a");
			a=sc.nextInt();
			System.out.println("Enter the value for b");
			b=sc.nextInt();
			
			int ans=a/b;
			System.out.println("Division of a and b is: "+ans);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error: Number cannot divide by zero");
			//System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You!");
		}
	}

}
