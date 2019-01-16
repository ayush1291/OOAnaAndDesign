package chap1.step2;

import java.util.Scanner;


//Now, we dont have to worry about case sensitive search 


public class Runner {
	
	public static void main(String[] args) {
		Inventory inv = new Inventory();
		initInv(inv);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please tell the guitar type..");
		System.out.println("Name: ");
		String name=scanner.nextLine();
		Name NAME=Name.search(name);
		if(NAME==null) System.out.println("Not correct type");
		
		System.out.println("Wood: ");
		String wood = scanner.nextLine();
		Wood WOOD = Wood.search(wood);
		if(WOOD==null) System.out.println("Not correct wood");
		
		System.out.println("Guitar searching... "+name+" "+wood);
		Guitar searched = inv.search(new Guitar(0, 0, NAME, WOOD));
		if(searched==null){
			System.out.println("Nothing for you pal ...");
		}else{
			System.out.println("Yay!!...We found sth");
		}
	}
	
	
	static void initInv(Inventory inv){
		inv.addGuitar(1, 10, Name.NAME1,Wood.ALDER);
		inv.addGuitar(1, 10, Name.NAME2,Wood.WOOD2);
		inv.addGuitar(3, 20, Name.NAME2,Wood.WOOD2);
		inv.addGuitar(1, 10, Name.NAME3,Wood.WOOD3);
	}

}
