package chap1.step4;

public class GuitarSpec {

	private Name name;
	private Wood wood;
	int numStrings;

	public boolean search(GuitarSpec searchGuitar) {
		GuitarSpec spec = this;

		if (spec.getName() != searchGuitar.getName())
			return false;
		if (spec.getWood() != searchGuitar.getWood())
			return false;
		if(spec.getNumStrings()!=searchGuitar.getNumStrings()) return false;

		return true;
	}

	public GuitarSpec(Name name, Wood wood, int numStrings) {
		super();
		this.name = name;
		this.wood = wood;
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
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
