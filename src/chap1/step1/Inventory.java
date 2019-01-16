package chap1.step1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
			guitars=new LinkedList<>();
	}
	
	public void addGuitar(int serialNo, double price, String name, String wood){
		Guitar guitar = new Guitar(serialNo, price, name, wood);
		guitars.add(guitar);
	}
	
	public Guitar search(Guitar searchGuitar){
		//Ignore price and name as unique
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			String name = guitar.getName();
			if(!name.equals(searchGuitar.getName())) continue;
			String wood = guitar.getWood();
			if(!wood.equals(searchGuitar.getWood())) continue;
			return guitar;
		}
		return null;
	}
}
