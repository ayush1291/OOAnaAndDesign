package chap1.step3;

public class GuitarSpec {
	
	private Name name;
	private Wood wood;
	
	
	public GuitarSpec(Name name, Wood wood) {
		this.name = name;
		this.wood = wood;
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
