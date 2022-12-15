package model;

public abstract class Pet {
	
	private String name;
	
	public Pet(String name) {
		super();
		this.name = name;
	}

	public abstract void speak();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
