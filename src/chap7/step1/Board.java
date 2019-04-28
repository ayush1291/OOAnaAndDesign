package chap7.step1;

import java.util.List;

// will have user sullpied width / height
// can return a tile at any position given x and y
// add unit to x and y position
// return units given x and y
public class Board {
	
	Tile[][] tiles;
	
	protected Board(Tile[][] tile){
		tiles = tile;
	}
	
	void addUnit(int x, int y, Unit unit){
		tiles[x-1][y-1].addUnit(unit);;
	}
	
	void removeUnits(int x, int y){
		getTile(x,y).removeUnits();
	}
	
	//Move to utility class
	void removeUnits(int x, int y, Unit unit){
		getTile(x,y).removeUnit(unit);
	}
	
	List<Unit> getUnits(int x, int y){
		return getTile(x,y).getUnit();
	}
	
	public Tile getTile(int x, int y){
		return tiles[x-1][y-1];
	}

	public Tile[][] getTiles() {
		return tiles;
	}

//	we removed these methods as instead of passing height and width for reating of tiles and board, 
//	we are directly passing tiles array
//	public int getHeight() {
//		return height;
//	}
//
//	public int getWidth() {
//		return width;
//	}

	public void setTiles(Tile[][] tiles) {
		this.tiles = tiles;
	}

//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
	
	

}
