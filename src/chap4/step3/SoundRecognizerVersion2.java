package chap4.step3;

public class SoundRecognizerVersion2 {

	DogDoorVersion2 dogDoor;

	public SoundRecognizerVersion2(DogDoorVersion2 dogDoor) {
		this.dogDoor = dogDoor;
	}

	public void recognize(Bark bark) {
		System.out.println("Recognizing " + bark.getSound());
		boolean isAMatch =  false;
		for (Bark allowedBark : dogDoor.getAllowedBarks()) {
			if (allowedBark.checkBark(bark)) {
				dogDoor.openTheDoor();
				isAMatch = true;
				break;
			}
		}
		if (!isAMatch) {
			System.out.println("Incorrect sound....");
		}

	}
}
