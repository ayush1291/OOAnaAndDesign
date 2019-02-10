package chap5.step4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//Now, the encapsulated specs are only used for searching

public class Inventory {

	private List instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(int serialNumber, double price, InstrumentSpec instrumentSpec) {
		Instrument instrument = new Instrument(serialNumber, price, instrumentSpec);
		instruments.add(instrument);
	}

	// will return all instruments
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List search(InstrumentSpec searchInstrumentSpec) {
		// Ignore price and name as unique
		List list = new ArrayList<>();
		for (Iterator itr = instruments.iterator(); itr.hasNext();) {

			Instrument i = (Instrument) itr.next();
			if (i.getInstrumentSpec().matches(searchInstrumentSpec)) {
				list.add(i);
			}
		}
		return list;
	}

}
