package chap1.step3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//Now, the encapsulated specs are only used for searching

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
			guitars=new LinkedList<>();
	}
	
	public void addGuitar(int serialNo, double price, Name name,Wood wood){
		GuitarSpec spec = new GuitarSpec(name, wood);
		Guitar guitar = new Guitar(serialNo, price, spec);
		guitars.add(guitar);
	}
	
	public List<Guitar> search(GuitarSpec searchGuitar){
		//Ignore price and name as unique
		List<Guitar> list = new ArrayList<>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			GuitarSpec spec = guitar.getSpecs();
			if(spec.getName()!=searchGuitar.getName()) continue;
			if(spec.getWood()!=searchGuitar.getWood()) continue;
			list.add(guitar);
		}
		return list;
	}
}
