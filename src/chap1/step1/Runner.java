package chap1.step1;

import java.util.Scanner;

//Here, the search results does not work as expected, and most times showing no results

//Problems: We are not using constants for these values, thats why case sensitive errors are coming
// Inventory and guitar are too much dependent

public class Runner {
	
	public static void main(String[] args) {
		Inventory inv = new Inventory();
		initInv(inv);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please tell the guitar type..");
		System.out.println("Name: ");
		String name=scanner.nextLine();
		System.out.println("Wood: ");
		String wood = scanner.nextLine();
		System.out.println("Guitar searching... "+name+" "+wood);
		Guitar searched = inv.search(new Guitar(0, 0, name, wood));
		if(searched==null){
			System.out.println("Nothing for you pal ...");
		}else{
			System.out.println("Yay!!...We found sth");
		}
	}
	
	
	static void initInv(Inventory inv){
		inv.addGuitar(1, 10, "Name1","Alder");
		inv.addGuitar(1, 10, "Name2","Wood2");
		inv.addGuitar(1, 10, "Name3","Wood3");
	}

}
