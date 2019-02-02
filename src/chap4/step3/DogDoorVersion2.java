package chap4.step3;

public class DogDoorVersion2 extends Door{

	// works in real life context
	// as pur dogiee can have multiple barks
	private Bark allowedBarks[];	
	@Override
	public void open() {
		System.out.println("The dog door is getting opened");
	}

	@Override
	public void close() {
		System.out.println("The dog door is getting closed");
	}

	public Bark[] getAllowedBarks() {
		return allowedBarks;
	}

	public void setAllowedBarks(Bark allowedBarks[]) {
		this.allowedBarks = allowedBarks;
	}
	
}
