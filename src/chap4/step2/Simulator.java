package chap4.step2;


public class Simulator {
	
	public static void main(String[] args) {
		
	    System.out.println("With version 1");
	    DogDoor door1 = new DogDoor();
		door1.enableAutoDoorOpen(0);
		door1.setAllowedBark("woof");
		
		System.out.println("*******test 1********");
		System.out.println("Fido starts barking...woof");

		SoundRecognizer recognizer = new SoundRecognizer(door1);
		recognizer.recognize("woof");
		
		
		//just to give time to test 1 to complete
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println("*******test 1******** : Pass");		
		System.out.println("*******test 2********");
		System.out.println("Fido ka dost.....starts barking...woofieeeee");
		recognizer.recognize("woofieeeee");
		System.out.println("*******test 2******** : Pass");	
		
		//just to give time to test 1 to complete
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
				
		//till here all good
		System.out.println("*******test 3********");
		System.out.println("Fido starts barking...woof woof");
		recognizer.recognize("woof woof");
		System.out.println("*******test 3******** : Fail");	
		
		
		
	}

}
