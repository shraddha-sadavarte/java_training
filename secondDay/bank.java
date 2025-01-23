package secondDay;

import java.util.Scanner;

public class bank {
	
	String accountHolder;
	double balance;
	int totalamt;
	
	Scanner sc=new Scanner(System.in); 
	
	public bank(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	
	public void deposit() {
		System.out.println("Enter amount you want to deposit: ");
		int depoamt=sc.nextInt();
		totalamt=totalamt+depoamt;
		System.out.println("Amount deposited successfully! \nYour total account balance is: "+totalamt);
	}
	
	 public void withdraw() {
	        System.out.println("Enter how much amount you want to withdraw: ");
	        int widamt = sc.nextInt();

	        if (totalamt - widamt < 100) {
	            System.out.println("Error: Insufficient amount! You cannot withdraw this amount. Minimum balance should be 100.");
	        } else {
	            totalamt = totalamt - widamt;
	            System.out.println("Amount withdrawn successfully! \nYour total account balance is: " + totalamt);
	        }
	    }
	
	public void display() {
		System.out.println("Your bank details....");
		System.out.println("Total balance of your account: "+totalamt);
	}
	
	
	public static void main(String[]args) {
		bank b=new bank("ABC");
		String userChoice = "";
		
		do {
			System.out.println("=========Banking Menu==========");
			System.out.println("1.Show account details \n2.Deposit amount \n3.Withdraw amount \n4.Exit");
			int ch;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your choice");
		    ch=scan.nextInt();
		    switch(ch) {
		    case 1:
		    	b.display();
		    	break;
		    
		    case 2:
		    	b.deposit();
		    	break;
		    	
		    case 3:
		    	b.withdraw();
		    	break;
		    	
		    case 4:
		    	System.exit(0);
		    }
		    
		    
		    System.out.println("Do you want to continue(yes/no): ");
		    userChoice=scan.next();
		    
		}while(userChoice.equalsIgnoreCase("yes"));
	
	}

}
