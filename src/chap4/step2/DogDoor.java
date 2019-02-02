package chap4.step2;

public class DogDoor extends Door{

	private String allowedBark;	
	@Override
	public void open() {
		System.out.println("The dog door is getting opened");
	}

	@Override
	public void close() {
		System.out.println("The dog door is getting closed");
	}

	public String getAllowedBark() {
		return allowedBark;
	}

	public void setAllowedBark(String allowedBark) {
		this.allowedBark = allowedBark;
	}
	
}
