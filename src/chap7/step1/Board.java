package chap7.step1;

import java.util.List;

// will have user sullpied width / height
// can return a tile at any position given x and y
// add unit to x and y position
// return units given x and y
public class Board {
	
	Tile[][] tiles;
	int height;
	int width;
	
	Board(int height, int width, Tile tile){
		this.height = height;
		this.width = width;
		tiles = new Tile[width][height];
		for (int i = 0; i< width; i++) {
			for (int j = 0; j< height; j++) {
				tiles[i][j] = tile;
			}
		}
	}
	
	void addUnit(int x, int y, Unit unit){
		Tile tile = tiles[x][y];
		tile.addUnit(unit);
	}
	
	void removeUnits(int x, int y){
		getTile(x,y).removeUnits();
	}
	
	void removeUnits(int x, int y, Unit unit){
		getTile(x,y).removeUnit(unit);
	}
	
	List<Unit> getUnits(int x, int y){
		return getTile(x,y).getUnit();
	}
	
	Tile getTile(int x, int y){
		return tiles[x][y];
	}

}
