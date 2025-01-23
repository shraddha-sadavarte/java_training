package java_first_program;
import java.util.*;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a,b;
//		a=10;
//		b=20;
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter value for b: ");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}

	}

}
