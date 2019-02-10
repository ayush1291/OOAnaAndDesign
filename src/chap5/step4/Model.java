package chap5.step4;

public enum Model {
	MODEL1, MODEL2, MODEL3;
	
	public String toString() {
		switch(this){
			case MODEL1 : return "Model1";
			case MODEL2 : return "Model2";
			case MODEL3 : return "Model3";
		}
		return "";
	};
	
	public static Model search(String str){
		if(str.equalsIgnoreCase(MODEL1.toString())) return MODEL1;
		if(str.equalsIgnoreCase(MODEL2.toString())) return MODEL2;
		if(str.equalsIgnoreCase(MODEL3.toString())) return MODEL3;
		return null;
	}

}
