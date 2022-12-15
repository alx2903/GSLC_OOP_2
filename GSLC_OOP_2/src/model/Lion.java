package model;

public class Lion extends Pet {

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("rawr");
	}

	public void cepmek() {
		System.out.println(this.getName() + " says: Kamu Nanyea?!!");
	}
}
