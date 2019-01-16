package chap1.step2;


public class Guitar {

	private int serialNo;
	private double price;
	private Name name;
	private Wood wood;
	
	
	public Guitar(int serialNo, double price, Name name, Wood wood) {
		this.serialNo = serialNo;
		this.price = price;
		this.name = name;
		this.wood=wood;
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


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Wood getWood() {
		return wood;
	}


	public void setWood(Wood wood) {
		this.wood = wood;
	}
	
	
	
	
}
