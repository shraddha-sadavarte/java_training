package java_first_program;


public class add_two {
	
	int num1,num2;
	
	void add() {
		num1=10;
		num2=12;
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	
	void sub() {
		num1=23;
		num2=21;
		System.out.println("Subtraction of two numbers: "+(num1-num2));
	}
	
	void mul() {
		num1=22;
		num2=21;
		System.out.println("Multiplication of two numbers: "+(num1*num2));
	}
	
	void div() {
		num1=100;
		num2=21;
		System.out.println("Division of two numbers: "+(num1/num2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add_two obj=new add_two();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
	}

}
