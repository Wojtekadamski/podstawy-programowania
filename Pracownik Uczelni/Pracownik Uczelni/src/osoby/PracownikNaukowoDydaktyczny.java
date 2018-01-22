package osoby;

import zadania.KonsultacjeProwadzacy;

import java.io.Serializable;

public class PracownikNaukowoDydaktyczny extends PracownikUczelni implements Serializable {

	/**
	 * 
	 */
    static final int CZTRWANIA = 90;

    public int getCzasPozostaly() {
        return czasPozostaly;
    }

    public void setCzasPozostaly(int czasPozostaly) {
        this.czasPozostaly = czasPozostaly;
    }

    int czasPozostaly=90;
	private static final long serialVersionUID = 1L;

    public KonsultacjeProwadzacy getKonsultacje() {
        return konsultacje;
    }

    public void setKonsultacje(KonsultacjeProwadzacy konsultacje) {
        this.konsultacje = konsultacje;
    }

    private KonsultacjeProwadzacy konsultacje;
	
	public PracownikNaukowoDydaktyczny() {



		konsultacje = new KonsultacjeProwadzacy();
		
	}

    public String toString() {

        return super.toString() + "\tpozostały czas konsultacji: " + getCzasPozostaly();

    }

}
