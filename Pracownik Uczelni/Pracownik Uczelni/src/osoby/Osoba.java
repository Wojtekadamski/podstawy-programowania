package osoby;

import java.io.Serializable;

import pakietStartowy.Main;
import uczelnia.Uczelnia;

public abstract class Osoba implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imie;
	private String nazwisko;
	private int wiek = 0;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getPesel() {
        return pesel;
    }

    private String pesel = " ";
	
	
	public Osoba() {
		
		System.out.println("Tworzenie nowej osoby:");
		
		System.out.print("imie: ");
		imie = Main.c.next();
		
		System.out.print("nazwisko: ");
		nazwisko = Main.c.next();
		
		System.out.print("wiek: ");
		
		wiek=Main.c.nextInt();

        boolean czyPoprawne=false;


		    System.out.print("Pesel: ");
            while(pesel.length() != 11) {
                pesel = Main.c.next();
                if (pesel.length() != 11)
                    System.out.println("pesel nieprawidłowy, spróbuj ponownie");
             }

        }


    public Osoba(String imie, String nazwisko,int wiek, String pesel){
	    this.imie=imie;
	    this.nazwisko=nazwisko;
	    this.pesel=pesel;
	    this.wiek=wiek;

    }

	
	public String toString() { return "Imie: " + imie + "\tNazwisko: " + nazwisko + "\tWiek: " + wiek + "\tPesel: " + pesel; }
	



}
