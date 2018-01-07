package osoby;

import zadania.Konsultacje;

import java.io.Serializable;

public class PracownikNaukowoDydaktyczny extends PracownikUczelni implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Konsultacje konsultacje;
	
	public PracownikNaukowoDydaktyczny() {



		konsultacje = new Konsultacje();
		
	}
	

	
}
