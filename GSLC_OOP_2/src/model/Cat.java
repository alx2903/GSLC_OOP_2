package model;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meong meong");
	}
	
	public void scracth() {
		System.out.println(this.getName() + " is scratching");
	}
}
