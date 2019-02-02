package chap4.step1;

//For sounds could have taken enums

public interface SoundRecognizer {

	public void recognize(String sound);

	public class DogRecognizer implements SoundRecognizer {

		Door door;

		public DogRecognizer(Door door) {
			this.door = door;
		}

		@Override
		public void recognize(String sound) {
			System.out.println("Recognizing " + sound);
			door.openTheDoor();
		}
	}
}
