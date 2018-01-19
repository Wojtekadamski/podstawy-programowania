package osoby;

import zadania.KonsultacjeProwadzacy;

import java.io.Serializable;

public class PracownikNaukowoDydaktyczny extends PracownikUczelni implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private KonsultacjeProwadzacy konsultacje;
	
	public PracownikNaukowoDydaktyczny() {



		konsultacje = new KonsultacjeProwadzacy();
		
	}
	

	
}
