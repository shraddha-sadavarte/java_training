package secondDay;

public class Vehicle {
	
	String model;
	int prize;
	
	//default constructor
	public Vehicle(){
		model="Honda";
		prize=120000;
	}
	
	public Vehicle(String model,int prize) {
		this.model=model;
		this.prize=prize;
	}
	
	public void display() {
		System.out.println("Model: "+model);
		System.out.println("Prize: "+prize);
	}
	public static void main(String[]args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle("BMW",700000);
		
		v1.display();
		v2.display();
	}

}
