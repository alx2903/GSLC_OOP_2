package model;

public class Human extends Pet {

	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Halo nama saya " + this.getName());
	}
	
	public void bundir() {
		System.out.println(this.getName() + " ingin mati");
	}
}
