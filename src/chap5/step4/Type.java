package chap5.step4;

public enum Type {
	TYPE1, TYPE2;
	
	public String toString() {
		switch(this){
			case TYPE1 : return "Type1";
			case TYPE2 : return "Type2";
		}
		return "";
	};
	
	public static Type search(String str){
		if(str.equalsIgnoreCase(TYPE1.toString())) return TYPE1;
		if(str.equalsIgnoreCase(TYPE2.toString())) return TYPE2;
		return null;
	}

}
