package chap5.step4;

import java.util.HashMap;
import java.util.Map;

public class Runner2 {
	
	public static void main(String[] args) {
		Inventory inv = new Inventory();
		initInv(inv);
		
		
		Map clientSpec = new HashMap<>();
		clientSpec.put("model", Model.MODEL1);
		clientSpec.put("wood", Wood.ALDER);
		
	
		System.out.println(inv.search(new InstrumentSpec(clientSpec)).size());
		
		
		
		clientSpec.put("model", Model.MODEL1);
		clientSpec.remove("wood");
		
	
		System.out.println(inv.search(new InstrumentSpec(clientSpec)).size());
		
	}
	
	
	@SuppressWarnings("unchecked")
	static void initInv(Inventory inv){
		Map map1  = new HashMap<>();
		map1.put("instrumentType", InstrumentType.GUITAR);
		map1.put("model", Model.MODEL1);
		map1.put("wood", Wood.ALDER);
		map1.put("strings", 6);
		inv.addInstrument(1, 11, new InstrumentSpec(map1));
		
		inv.addInstrument(2, 11, new InstrumentSpec(map1));
		
		
		map1.put("model", Model.MODEL1);
		map1.put("wood", Wood.WOOD2);
		map1.put("strings", 6);
		inv.addInstrument(2, 11, new InstrumentSpec(map1));
		
		map1.put("instrumentType", InstrumentType.MANDOLIN);
		map1.put("model", Model.MODEL1);
		map1.put("wood", Wood.WOOD2);
		map1.put("type", Type.TYPE1);
		map1.remove("strings");
		inv.addInstrument(3, 33, new InstrumentSpec(map1));
		
		map1.put("wood", Wood.WOOD3);
		inv.addInstrument(4, 55, new InstrumentSpec(map1));
		
		map1.put("wood", Wood.WOOD2);
		map1.put("type", Type.TYPE1);
		inv.addInstrument(4, 55, new InstrumentSpec(map1));
	}

}
