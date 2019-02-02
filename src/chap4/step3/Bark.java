package chap4.step3;

public class Bark {
	
	private String sound;

	public String getSound() {
		return sound;
	}

	Bark(String sound) {
		this.sound = sound;
	}

	
	public boolean checkBark(Object bark) {
		if (bark instanceof Bark) {
			if (this.sound.equals(((Bark) bark).sound)) {
				return true;
			}
			
		}
		return false;
	}
	
	
	

}
