package chap3.step1;

import chap3.step1.SoundRecognizer.DogRecognizer;

public class Simulator {
	
	public static void main(String[] args) {
		Door door = new DogDoor();
		door.enableAutoDoorOpen(2000);
		DogRecognizer recognizer = new DogRecognizer(door);
		System.out.println("Fedo starts barking");
		recognizer.recognize("woof");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Fedo's done");
		
		if(!door.isOpen){
			System.out.println("Fedo's stuck");
			System.out.println("Fedo starts barking");
			recognizer.recognize("woof");
			System.out.println("Fedo's inside now ");
			
		}else{
			System.out.println("Fedo's come inside");
		}
	}

}
