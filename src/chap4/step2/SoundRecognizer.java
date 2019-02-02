package chap4.step2;


public class SoundRecognizer {

	DogDoor dogDoor;

	public SoundRecognizer(DogDoor dogDoor) {
		this.dogDoor = dogDoor;
	}

	public void recognize(String sound) {
		System.out.println("Recognizing " + sound);
		if (dogDoor.getAllowedBark().equals(sound)) {
			dogDoor.openTheDoor();
		} else {
			System.out.println("Incorrect sound....");
		}
		
	}
}
