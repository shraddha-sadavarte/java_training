package jan28;

public class ageCheck {

	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Access Denied: Your age must be greater than 18");
		}
		else {
			System.out.println("Access Granted: You are old enough!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkAge(15);
	}

}
