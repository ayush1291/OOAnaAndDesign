package chap8.step1.lsp;

import chap7.step1.Board;
import chap7.step1.Tile;

public class BoardType3DFail extends Board{

	BoardType3DFail(Tile[][] tiles) {
		super(tiles);
		// TODO Auto-generated constructor stub
	}

	//3DBoard extending Board
		//But methhods it inherits don't fit here
		
		// SO LSP fails
		//this means inheritance doesn't work always
	
}
