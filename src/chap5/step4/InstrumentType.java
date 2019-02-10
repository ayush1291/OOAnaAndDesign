package chap5.step4;

public enum InstrumentType {
	MANDOLIN, GUITAR, BANJO;
	
	public String toString() {
		switch(this){
			case MANDOLIN : return "Mandolin";
			case GUITAR : return "Guitar";
			case BANJO : return "Banjo";
		}
		return "";
	};
	
}
