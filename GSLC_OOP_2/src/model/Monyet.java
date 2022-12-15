package model;

public class Monyet extends Pet {

	public Monyet(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("UU AA!!");
	}
	
	public void domi() {
		System.out.println(this.getName() + " wants to kill humans");
	}
}
