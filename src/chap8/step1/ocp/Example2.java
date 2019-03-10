package chap8.step1.ocp;

public class Example2 {

	// u have many private methods thhat do something imp
	private void methodA() {

	}

	private void methodB() {

	}

	private void methodC() {

	}

	// you can add public methods that use these private ones in diff ways

	public void reqA() {
		methodA();
		methodB();
	}

	public void reqB() {
		methodB();
	}

	public void reqC() {
		methodB();
		methodC();
	}
}
