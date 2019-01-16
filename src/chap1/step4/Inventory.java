package chap1.step4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


// we shoould use here guitarspec, as if new peoperty is added, then a problem


public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
			guitars=new LinkedList<>();
	}
	
	public void addGuitar(int serialNo, double price,GuitarSpec spec){
		Guitar guitar = new Guitar(serialNo, price, spec);
		guitars.add(guitar);
	}
	
	public List<Guitar> search(GuitarSpec searchGuitar){
		//Ignore price and name as unique
		List<Guitar> list = new ArrayList<>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			GuitarSpec spec = guitar.getSpecs();
			if(spec.search(searchGuitar)) list.add(guitar);
		}
		return list;
	}
}
