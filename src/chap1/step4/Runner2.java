package chap1.step4;

import java.util.List;
import java.util.Scanner;


//Now, we dont have to worry about case sensitive search 
// Here, we first fulfil customer needs, they get for what they search, and also they gt the list of results..generally do this
// keeping in mind oo priniples

//But to add a new property, we need to change guitar and inventory both, suppose to add no of strings of guitar

public class Runner2 {
	
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
		
		System.out.println("Strings: ");
		int strings = scanner.nextInt();
		
		
		System.out.println("Guitar searching... "+name+" "+wood);
		List<Guitar> searched = inv.search(new GuitarSpec(NAME, WOOD,strings));
		if(searched.size()==0){
			System.out.println("Nothing for you pal ...");
		}else{
			System.out.println("Yay!!...We found sth");
			for (Guitar guitar : searched) {
				System.out.println(guitar.getSerialNo()+" "+guitar.getPrice());
			}
		}
	}
	
	
	static void initInv(Inventory inv){
		inv.addGuitar(1, 10, new GuitarSpec(Name.NAME1, Wood.ALDER, 12));
		inv.addGuitar(1, 10, new GuitarSpec(Name.NAME2, Wood.WOOD2, 12));
		inv.addGuitar(3, 20, new GuitarSpec(Name.NAME2, Wood.WOOD2, 12));
		inv.addGuitar(1, 10, new GuitarSpec(Name.NAME3, Wood.WOOD3, 12));
	}

}
