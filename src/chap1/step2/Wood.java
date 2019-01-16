package chap1.step2;

public enum Wood {
	ALDER, WOOD2, WOOD3;
	
	public String toString() {
		switch(this){
			case ALDER : return "Alder";
			case WOOD2 : return "Wood2";
			case WOOD3 : return "Wood3";
		}
		return "";
	};
	
	public static Wood search(String str){
		if(str.equalsIgnoreCase(ALDER.toString())) return ALDER;
		if(str.equalsIgnoreCase(WOOD2.toString())) return WOOD2;
		if(str.equalsIgnoreCase(WOOD3.toString())) return WOOD3;
		return null;
	}

}
