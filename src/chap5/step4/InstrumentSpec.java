package chap5.step4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {

	Map properties;
	
	public InstrumentSpec(Map properties) {
		if (properties ==  null) {
			this.properties = new HashMap<>();
		} else {
			this.properties = new HashMap<>(properties);
		}
	}
	
	
	public Map getProperties() {
		return this.properties;
	}
	
	public Object getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
	
	public boolean matches(InstrumentSpec other) {
		for (Iterator i = other.getProperties().keySet().iterator(); i.hasNext(); ) {
			String propertyName = (String) i.next();
			if (!other.getProperties().get(propertyName).equals(this.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
