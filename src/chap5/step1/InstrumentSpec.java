package chap5.step1;

public abstract class InstrumentSpec {

	private Model model;
	private Wood wood;
	public Model getModel() {
		return model;
	}
	public Wood getWood() {
		return wood;
	}
	public InstrumentSpec(Model model, Wood wood) {
		this.model = model;
		this.wood = wood;
	}
	
	public boolean matches(InstrumentSpec other) {
		if (!this.wood.equals(other.wood)) {
			return false;
		}
		if (!this.model.equals(other.model)) {
			return false;
		}
		return true;
	}
	
	
	
}
