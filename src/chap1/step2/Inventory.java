package chap1.step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//THere is problem in search method...done in step3


public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
			guitars=new LinkedList<>();
	}
	
	public void addGuitar(int serialNo, double price, Name name,Wood wood){
		Guitar guitar = new Guitar(serialNo, price, name, wood);
		guitars.add(guitar);
	}
	
	public Guitar search(Guitar searchGuitar){
		//Ignore price and name as unique
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			if(guitar.getName()!=searchGuitar.getName()) continue;
			if(guitar.getWood()!=searchGuitar.getWood()) continue;
			return guitar;
		}
		return null;
	}
	
	public List<Guitar> search2(Guitar searchGuitar){
		//Ignore price and name as unique
		List<Guitar> list = new ArrayList<>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			if(guitar.getName()!=searchGuitar.getName()) continue;
			if(guitar.getWood()!=searchGuitar.getWood()) continue;
			list.add(guitar);
		}
		return list;
	}
}
