package chap4.step1;

public class DogDoor extends Door{

	@Override
	public void open() {
		System.out.println("The dog door is getting opened");
	}

	@Override
	public void close() {
		System.out.println("The dog door is getting closed");
	}
	
}
