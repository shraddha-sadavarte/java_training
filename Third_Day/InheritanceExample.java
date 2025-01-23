package Third_Day;

class Animal{
	String name;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name+" sounds wolf");
	}
}

public class InheritanceExample {
	
	public static void main(String[] args) {
		Animal animal=new Animal("Cat");
		animal.makeSound();
		
		Dog dog=new Dog("Buddy");
		dog.makeSound();
		
	}

}
