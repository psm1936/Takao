package ¿Â≥≠∞®ªÃ±‚;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {

	Random r = new Random();
	ArrayList<Toy> toyList = new ArrayList<Toy>();

	public void addToy(Toy toy) {
		toyList.add(toy);
	}
	
	public Toy getToy() {
		int rd = r.nextInt(toyList.size());
		return toyList.get(rd);			
	}
}
