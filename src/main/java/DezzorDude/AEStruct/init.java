package DezzorDude.AEStruct;

import DezzorDude.AEStruct.Blocks.block;
import DezzorDude.AEStruct.Items.item;
import DezzorDude.AEStruct.Blocks.Tiles.tileBlock;


public class init {
	
	public static void ini(){
			block.load();
			item.load();
			tileBlock.load();
	}
}
