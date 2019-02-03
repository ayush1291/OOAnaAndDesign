package chap5.step1;

public class MandolinSpec extends InstrumentSpec{

	private Type type;
	public MandolinSpec(Model model, Wood wood, Type type) {
		super(model, wood);
		this.type = type;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public boolean matches(InstrumentSpec other) {
		
		if (super.matches(other)) {
			if (other instanceof MandolinSpec) {
				MandolinSpec otherSpec = (MandolinSpec) other;
				return this.type.equals(otherSpec.type);
			}
		}
		
		return false;
	}

	
	
	
}
