package chap5.step4;

public class Instrument {

	private int serialNumber;
	private Double price;
	private InstrumentSpec instrumentSpec;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}
	public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
		this.instrumentSpec = instrumentSpec;
	}
	public Instrument(int serialNumber, Double price, InstrumentSpec instrumentSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}
	
	
	
}
