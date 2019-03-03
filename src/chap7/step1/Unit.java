package chap7.step1;

import java.util.Map;

//unitsImages
//Our units can be anything
// eg for one game, we can have soldier, tank, aeroplane
// properties : name, weapon ; experience, attack, defense ; speed, gun, model
// we can find out whats common n whats different
// imgUnits

//approach 1 (imgUnits1)
//approach 2 (imgUnits2)
// conclusion (imgUnits3)


//wit final approoch
public class Unit {
	String type;
	Map<String, String> map;
	public String getType() {
		return type;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	

}


// but units have to move
// each unit hhas defined moves, game decides whethher its legal or not
//(imgUnits4)


