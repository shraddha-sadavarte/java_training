package Third_Day;

import java.util.Scanner;

class Employee{
	String name;
	static int id;
	int salary;
	
	static {
		System.out.println("Static block executed: Id initialized to "+id);
	}
	{
		id=id+1;
		System.out.println("\nInstance block executed: Id is: "+id);
	}
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void displayInfo(){
		System.out.println("Employee name is: "+name);
		System.out.println("Employee id is: "+id);
		System.out.println("Employee salary is: "+salary);
	}
}

class Manager extends Employee{
	String department;
	Manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}
	
	public void ManagerTeam() {
		System.out.println("\n===============================");
		System.out.println("Name of manager: "+name);
		System.out.println("Department: "+department);
		
		String[]emp= {"Alice","Bob","John"};
        System.out.println("Employee works under manager: ");
		for(String emps:emp) {
			System.out.print(emps+",");
		}
	}
	
	public void displayInfo() {
		System.out.println("\n===============================");
		System.out.println("Name of manager: "+name+"\nId: "+id+"\nSalary: "+salary);
		System.out.println("Department: "+department);
	}
}

class Developer extends Employee{
	String programmingLang;
	Developer(String name,int salary,String programmingLang){
		super(name,salary);
		this.programmingLang=programmingLang;
	}
	
	public void code() {
		System.out.println("\n===============================");
		System.out.println(name+" can code well in "+programmingLang);
	}
	
	public void displayInfo() {
		System.out.println("\n===============================");
		System.out.println("Name of manager: "+name+"\nId: "+id+"\nSalary: "+salary);
		System.out.println("Programming Language: "+programmingLang);
	}
}

class SalesPerson extends Employee{
	int targetSales;
	int targetcmt;
	SalesPerson(String name,int salary,int targetSales){
		super(name,salary);
		this.targetSales=targetSales;
	}
	
	public void achieveTarget() {
		System.out.println("\n===============================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Your total sales target is: "+targetSales);
		System.out.println("Enter how much taget you have completed: ");
		targetcmt=sc.nextInt();
		System.out.println("You are supposed to complete: "+(targetSales-targetcmt));
	}
	
	public void displayInfo() {
		System.out.println("\n===============================");
		System.out.println("Name of manager: "+name+"\nId: "+id+"\nSalary: "+salary);
		System.out.println("Target Sales: "+targetSales);
		System.out.println("Target completed: "+targetcmt);
		System.out.println("Target needs to complete: "+(targetSales-targetcmt));
	}
	
	public static void totalUsers() {
		System.out.println("Total users are: "+id);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee("John",12000);
		e.displayInfo();
		
		Manager m=new Manager("Lara",15000,"Account");
		m.ManagerTeam();
		m.displayInfo();
		
		Developer d=new Developer("Jockey",13400,"Java");
		d.code();
		d.displayInfo();
		
		SalesPerson sp=new SalesPerson("Bob",18000,10);
		sp.achieveTarget();
		sp.displayInfo();
		
		System.out.println("\n======================");
		SalesPerson.totalUsers();
		
	}

}
