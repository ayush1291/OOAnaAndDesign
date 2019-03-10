package chap8.step1.ocp;

import chap5.step4.Model;
import chap5.step4.Wood;



///this class is closed to modification : as we dont change matchhes() in base class
/// open : subclass calls base method and overrides as per its wish
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
