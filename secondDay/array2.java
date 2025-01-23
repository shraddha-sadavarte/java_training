package secondDay;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr=new int[15];
		System.out.println("Enter 15 numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<15;i++) {
			System.out.println("Enter "+(i)+" number: ");
			arr[i]=sc.nextInt();
		}
		
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
		System.out.println("Maximum number is: "+arr[arr.length-1]);
	}

}
