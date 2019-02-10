package chap5.step3;

import chap5.step1.GuitarSpec;
import chap5.step1.MandolinSpec;
import chap5.step1.Model;
import chap5.step1.Type;
import chap5.step1.Wood;

//Now, we dont have to worry about case sensitive search 
// Here, we first fulfil customer needs, they get for what they search, and also they gt the list of results..generally do this
// keeping in mind oo priniples

//But to add a new property, we need to change guitar and inventory both, suppose to add no of strings of guitar
//Also, in inventory, in addGuitar, the guitarspec should be passed as otherwise its not easy to add a new property- change in both classes

public class Runner2 {
	
	public static void main(String[] args) {
		Inventory inv = new Inventory();
		initInv(inv);
		
		
		System.out.println("Searching for Guitar with model 1 and wood alder");
		System.out.println(inv.search(new GuitarSpec(Model.MODEL1, Wood.ALDER)).size());
		
		System.out.println("***********");
		System.out.println("Searching for Guitar with model 1 and wood wood2");
		System.out.println(inv.search(new GuitarSpec(Model.MODEL1, Wood.WOOD2)).size());
		
		System.out.println("***********");
		System.out.println("Searching for Guitar with model 2 and wood alder");
		System.out.println(inv.search(new GuitarSpec(Model.MODEL2, Wood.ALDER)).size());
		
		
		System.out.println("***********");
		System.out.println("Searching for Mandolin with model 1 and wood alder and type 1");
		System.out.println(inv.search(new MandolinSpec(Model.MODEL1, Wood.ALDER, Type.TYPE1)).size());
		
		System.out.println("***********");
		System.out.println("Searching for Mandolin with model 1 and wood wood2 and type 1");
		System.out.println(inv.search(new MandolinSpec(Model.MODEL1, Wood.WOOD2, Type.TYPE1)).size());
		 
		
		System.out.println("***********");
		System.out.println("Searching for Mandolin with model 1 and wood wood1 and type 2");
		System.out.println(inv.search(new MandolinSpec(Model.MODEL1, Wood.ALDER, Type.TYPE2)).size());
		
	}
	
	
	static void initInv(Inventory inv){
		inv.addInstrument(1, 11, new GuitarSpec(Model.MODEL1, Wood.ALDER));
		inv.addInstrument(2, 11, new GuitarSpec(Model.MODEL1, Wood.ALDER));
		inv.addInstrument(3, 33, new GuitarSpec(Model.MODEL2, Wood.ALDER));
		inv.addInstrument(4, 44, new MandolinSpec(Model.MODEL1, Wood.ALDER, Type.TYPE1));
		inv.addInstrument(5, 55, new MandolinSpec(Model.MODEL1, Wood.ALDER, Type.TYPE2));
	}

}
