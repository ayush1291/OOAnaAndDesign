package chap1.step4;

//OO principle followed here is encapsulation

public class Guitar {

	private int serialNo;
	private double price;
	private GuitarSpec specs;
	
	public Guitar(int serialNo, double price,GuitarSpec spec) {
		this.serialNo = serialNo;
		this.price = price;
		this.specs=spec;
	}


	public int getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public GuitarSpec getSpecs() {
		return specs;
	}


	public void setSpecs(GuitarSpec specs) {
		this.specs = specs;
	}
	
	
	
	
}
