package chap1.step1;

public class Guitar {

	private int serialNo;
	private double price;
	private String name;
	private String wood;
	
	
	public Guitar(int serialNo, double price, String name, String wood) {
		this.serialNo = serialNo;
		this.price = price;
		this.name = name;
		this.wood=wood;
	}
	
	
	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
