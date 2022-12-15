package model;

import interf.bab;

public class Dog extends Pet implements bab{

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
	
	@Override
	public void ee() {
		System.out.println(this.getName() + " sudah BAB");
	}
	
}
