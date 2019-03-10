package chap8.step1.lsp;

import java.util.List;

import chap7.step1.Board;
import chap7.step1.Tile;
import chap7.step1.Unit;

public class BoardType3DPass {

	int zpos;
	Tile[][][] tiles;

	// here we'll delegate responsibility to board....we have association here....of Board..choose board basis zpos and use uske methods fir
	
	Board[] boards;
	
	void addUnit(int x, int y, int z,Unit unit){
		Tile tile = getTile(x,y,z);
		tile.addUnit(unit);
	}
	
	void removeUnits(int x, int y, int z){
		boards[z-1].getTile(x,y).removeUnits();
	}
	
	void removeUnits(int x, int y, int z,Unit unit){
		boards[z-1].getTile(x,y).removeUnit(unit);
	}
	
	List<Unit> getUnits(int x, int y, int z){
		return boards[z-1].getTile(x,y).getUnit();
	}
	
	Tile getTile(int x, int y, int z){
		return boards[z-1].getTile(x, y);
	}
	
	
}
