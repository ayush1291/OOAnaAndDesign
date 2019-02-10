package chap4.step2;

public class SoundRecognizerVersion2 {

	DogDoorVersion2 dogDoor;

	public SoundRecognizerVersion2(DogDoorVersion2 dogDoor) {
		this.dogDoor = dogDoor;
	}

	public void recognize(Bark bark) {
		System.out.println("Recognizing " + bark.getSound());
		if (dogDoor.getAllowedBark().checkBark(bark)) {
			dogDoor.openTheDoor();
		} else {
			System.out.println("Incorrect sound....");
		}

	}
}
