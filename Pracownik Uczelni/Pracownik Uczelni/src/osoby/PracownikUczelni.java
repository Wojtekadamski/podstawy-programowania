package osoby;

import osoby.Osoba;
import pakietStartowy.Main;

import java.io.Serializable;

public abstract class PracownikUczelni extends Osoba implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String wydział;
	private double pensja = 0;
	
	public PracownikUczelni() {
		
		System.out.print("Na jakim wydziale pracuje : ");
		Main.c.nextLine();
				wydział = Main.c.nextLine();
		
		System.out.print("Pensja: ");

				pensja = Main.c.nextDouble();

		
	}
	
	public String toString() {
		
		return super.toString() + "\tPracuje w: " + wydział;
		
	}
	
	public double getPensja() { return pensja; }
	
}
