package model;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("Woof woof");

	}
	
	public void bark() {
		System.out.println(this.getName() + " is barking");
	}
}
