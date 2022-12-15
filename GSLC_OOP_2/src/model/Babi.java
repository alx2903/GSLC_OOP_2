package model;

public class Babi extends Pet {

	public Babi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("honk honk");
	}

	public void haram() {
		System.out.println(this.getName() + " is haram");
	}
}
