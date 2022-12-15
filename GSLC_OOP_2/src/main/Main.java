package main;

import java.util.Scanner;
import java.util.Vector;

import model.Babi;
import model.Cat;
import model.Dog;
import model.Human;
import model.Lion;
import model.Monyet;
import model.Pet;

public class Main {

	public Main() {
		Scanner scan = new Scanner(System.in);
		Vector<Pet> Vec = new Vector<>();
		int menu;
		String name;
		String tipe;
		
		do {
			System.out.println("Kebun Binatang");
			System.out.println("1. Add Binatang");
			System.out.println("2. View Binatang");
			System.out.println("3. Delete Binatang");
			System.out.println("4. Exit");
			System.out.printf(">> ");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch (menu) {
			case 1:
				for(;;) {
					System.out.println("Masukkan Jenis Binatang [Anjing | Kucing | Babi | Monyet | Singa | Manusia]: ");
					tipe = scan.nextLine();
					if(tipe.matches("Anjing") == true || tipe.matches("Kucing") == true || tipe.matches("Babi") == true || tipe.matches("Monyet") == true || tipe.matches("Singa") == true || tipe.matches("Manusia") == true) {
						break;
					}
				}
				if(tipe.matches("Anjing") == true) {
					System.out.println("Masukkan Nama: ");
					name = scan.nextLine();
					Dog dog = new Dog(name);
					Vec.add(dog);
					dog.speak();
				}
				else if(tipe.matches("Kucing") == true) {
					System.out.println("Masukkan Nama:");
					name = scan.nextLine();
					Cat cat = new Cat(name);
					Vec.add(cat);
					cat.speak();
				}
				else if(tipe.matches("Monyet") == true) {
					System.out.println("Masukkan Nama: ");
					name = scan.nextLine();
					Monyet monyet = new Monyet(name);
					Vec.add(monyet);
					monyet.speak();
				}
				else if(tipe.matches("Babi") == true) {
					System.out.println("Masukkan Nama:");
					name = scan.nextLine();
					Babi babi = new Babi(name);
					Vec.add(babi);
					babi.speak();
				}
				else if(tipe.matches("Manusia") == true) {
					System.out.println("Masukkan Nama: ");
					name = scan.nextLine();
					Human human = new Human(name);
					Vec.add(human);
					human.speak();
				}
				else if(tipe.matches("Singa") == true) {
					System.out.println("Masukkan Nama:");
					name = scan.nextLine();
					Lion lion = new Lion(name);
					Vec.add(lion);
					lion.speak();
				}
				break;
			
			case 2:
				if(Vec.isEmpty() == true) {
					System.out.println("Masukkin Binatang Dulu!!");
				}
				else {
					int i = 1;
					System.out.printf("%-3s | %-8s | %-5s\n", "No", "Name", "Activity");
					for (Pet pet : Vec) {
						System.out.printf("%-3d | %-8s | ", i, pet.getName());
						if(pet instanceof Dog) {
							((Dog) pet).bark();
						}
						else if(pet instanceof Cat) {
							((Cat) pet).scracth();
						}
						else if(pet instanceof Babi) {
							((Babi) pet).haram();
						}
						else if(pet instanceof Monyet) {
							((Monyet) pet).domi();
						}
						else if(pet instanceof Lion) {
							((Lion) pet).cepmek();
						}
						else if(pet instanceof Human) {
							((Human) pet).bundir();
						}
						i++;
					}
					System.out.printf("\n\n");
					break;
				}
				
			case 3:
				if(Vec.isEmpty() == true) {
					System.out.println("Masukkin Binatang Dulu!!");
				}
				else {
					int i = 1;
					System.out.printf("%-3s | %-8s", "No", "Name");
					for (Pet pet : Vec) {
						System.out.printf("%-3d | %-8s\n", i, pet.getName());
						i++;
					}
					System.out.printf("Select to kill: ");
					int del;
					del = scan.nextInt();
					System.out.printf(Vec.get(del-1).getName() + " has been killed\n\n");
					Vec.remove(del-1);
					break;
				}
			case 4:
				System.out.println("Terima kasih sudah datang!!");
				break;
			}
		} while (menu!=4);
	}

	public static void main(String[] args) {
		new Main();
	}

}
