package chap5.step1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Now, the encapsulated specs are only used for searching

public class Inventory {

	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(int serialNumber, double price, InstrumentSpec instrumentSpec) {
		Instrument instrument = null;
		if (instrumentSpec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) instrumentSpec);
		} else if (instrumentSpec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) instrumentSpec);
		}
		instruments.add(instrument);
	}

	public List<Guitar> searchGuitar(GuitarSpec searchGuitar) {
		// Ignore price and name as unique
		List<Guitar> list = new ArrayList<>();
		for (Iterator<Instrument> itr = instruments.iterator(); itr.hasNext();) {

			Instrument i = itr.next();
			if (i instanceof Guitar) {
				Guitar guitar = (Guitar) i;
				if (guitar.getInstrumentSpec().matches(searchGuitar))
					list.add(guitar);
			}
		}
		return list;
	}

	public List<Mandolin> searchMandolin(MandolinSpec searchMandolin) {
		// Ignore price and name as unique
		List<Mandolin> list = new ArrayList<>();
		for (Iterator<Instrument> itr = instruments.iterator(); itr.hasNext();) {
			Instrument i = itr.next();
			if (i instanceof Mandolin) {
				Mandolin mandolin = (Mandolin) i;
				if (mandolin.getInstrumentSpec().matches(searchMandolin))
					list.add(mandolin);
			}
		}
		return list;
	}

}
