package Third_Day;

import java.util.Scanner;

class Person{
	String name;
	static int id;
	
	Person(String name){
		this.name=name;
	}
//
//	
//	public void display() {
//		System.out.println("=============Person Information================");
//		System.out.println("Name: "+name);
//		System.out.println("Id: "+id);
//	}
	
	static {
		System.out.println("Static block executed: Id initialized to "+id);
	}
	{
		id=id+1;
		System.out.println("\nInstance block executed: Id is: "+id);
	}
	
	public void display() {
		System.out.println("Name is: "+name+"\nId is: "+id);
	}
	
}

class Student extends Person{
	String[] courseList=new String[3];
	double GPA;
	
	Student(String name,String[]courseList, double GPA) {
		super(name);
		this.courseList=courseList;
		this.GPA=GPA;
		
	}
	
	public void display() {
		System.out.println("================Student Information==================");
		System.out.println("Name: "+name+"\nId: "+id+"\nGPA: "+GPA);
		System.out.print("CourseList: ");
	    for (String course : courseList) {
	        System.out.println(course + ", ");
	    }
	}
}

class Teacher extends Person{
	int deptId;
	String[] subjects=new String[3];
	
	Teacher(String name,String[]subjects, int deptId) {
		super(name);
		this.subjects=subjects;
		this.deptId=deptId;
	}
	
	public void display() {
		System.out.println("================Teacher Information==================");
		System.out.println("Name: "+name+"\nId: "+id+"\ndeptId: "+deptId);
		System.out.print("Subjects: ");
	    for (String subs : subjects) {
	        System.out.print(subs + ", ");
	    }
	}
	
	public static void totalUsers() {
		System.out.println("Total users are: "+id);
	}
}

public class Assignment {

	
	public static void main(String[]args) {
	
		Person p=new Person("ABC");
		p.display();
		
		String[]courses= {"c","c++","Java"};
		Student s=new Student("PQR",courses,8.90);
		s.display();
		
		String[]course= {"Python","DS","Java"};
		Student s1=new Student("Jockey",course,8.80);
		s1.display();
		
		String[]sub= {"Math","Science","English"};
		Teacher t=new Teacher("LMN",sub,908);
		t.display();
		
		String[]sub1= {"Web Development","Blockchain","DBMS"};
		Teacher t1=new Teacher("Ms.Lara",sub,909);
		t1.display();
		
		System.out.println("\n====================================");
		Teacher.totalUsers();
	}

}
