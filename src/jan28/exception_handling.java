package jan28;

import java.util.Scanner;

public class exception_handling {
	public static void main(String[]args) {
		int[]arr=new int[5];
		int ele,ind;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++) {
			ele=sc.nextInt();
			arr[i]=ele;
		}
		try {
			System.out.println("Enter the index for which you want to print the value: ");
			ind=sc.nextInt();
			System.out.println("Element is: "+arr[ind]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You!!");
		}
	}

}
