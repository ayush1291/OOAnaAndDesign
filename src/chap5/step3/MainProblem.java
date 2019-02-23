package chap5.step3;

public class MainProblem {

	// 1. search method : search(GuitarSpec gs), search(MandolinSpec ms) etc
	// Since INstrumentSpec is abstract, so cannot have its object
	// But we can use "Code to interface, not to implementation" concept
	// so search(InstrumentSpec is), so its no more abstract
	
	//This will imporve add / search method longer and longer
	
	
	
	// 2. still we see that add INstrument is gettingbigger and bigger
	// notice Instrument is abtract, subclasses only contain constructors
	// BUT, Classes are really about behaviour
	// All classes Guitar / MAndolin have same behaviour, only properties are different
	// if we included methods like play / strum, then behaviou chnages, so making diff classes makes sense. Here it doesn't
	
	// so to keep common properties, we need Instrument classi
	// to encapsulate what varies, we need InstrumentSpec
	// But Instrument can be made a concrete class (IMG : img1)
	// So, img2
	
	// now, InstrumentSpec should be different for each type. Means, more sub classes
	// make it dynamic by changing it to map (step4)
	
	
	
}
