package chap7.step1;

import java.util.ArrayList;
import java.util.List;

public abstract class Tile {

	List<Unit> units;
	
	void addUnit(Unit unit) {
		if (null == units) {
			units = new ArrayList<>();
		}
		units.add(unit);
	}
	
	List<Unit> getUnit() {
		return units;
	}

	public void removeUnits() {
		units.clear();
	}
	
	public void removeUnit(Unit unit) {
		units.remove(unit);
	}
}
