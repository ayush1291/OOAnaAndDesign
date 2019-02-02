package chap4.step2;

public class DogDoorVersion2 extends Door{

	// OO concept used here
	// responsibility delegated to concerned object
	private Bark allowedBark;	
	@Override
	public void open() {
		System.out.println("The dog door is getting opened");
	}

	@Override
	public void close() {
		System.out.println("The dog door is getting closed");
	}

	public Bark getAllowedBark() {
		return allowedBark;
	}

	public void setAllowedBark(Bark allowedBark) {
		this.allowedBark = allowedBark;
	}
	
}
