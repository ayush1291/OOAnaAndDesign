package chap1.step4;

public enum Name {
	
	NAME1, NAME2, NAME3;
	
	public String toString() {
		switch(this){
		case NAME1 : return "Name1";
		case NAME2 : return "Name2";
		case NAME3 : return "Name3";
		}
		return "";
	};
	
	public static Name search(String str){
		if(str.equalsIgnoreCase(NAME1.toString())) return NAME1;
		if(str.equalsIgnoreCase(NAME2.toString())) return NAME2;
		if(str.equalsIgnoreCase(NAME3.toString())) return NAME3;
		return null;
	}

}
