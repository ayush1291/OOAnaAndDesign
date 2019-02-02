package chap4.step3;


public class SimulatorVersion2 {
	
	public static void main(String[] args) {
		
	    System.out.println("With version 1");
	    DogDoorVersion2 door1 = new DogDoorVersion2();
	    Bark bark = new Bark("woof");
		door1.enableAutoDoorOpen(0);
		Bark[] allowedBarks = {new Bark("woof"), new Bark("woof woof")};
		door1.setAllowedBarks(allowedBarks);
		
		System.out.println("*******test 1********");
		System.out.println("Fido starts barking...woof");

		SoundRecognizerVersion2 recognizer = new SoundRecognizerVersion2(door1);
		recognizer.recognize(bark);
		
		
		//just to give time to test 1 to complete
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println("*******test 1******** : Pass");	
		
		System.out.println("*******test 2********");
		System.out.println("Fido ka dost.....starts barking...woofieeeee");
		recognizer.recognize(new Bark("woofieeeee"));
		System.out.println("*******test 2******** : Pass");	
		
		//just to give time to test 1 to complete
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
				
		//till here all good
		System.out.println("*******test 3********");
		System.out.println("Fido starts barking...woof woof");
		recognizer.recognize(new Bark("woof woof"));
		System.out.println("*******test 3******** : Pass");	
		
		
		
	}

}
