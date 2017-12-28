package osoby;

import pakietStartowy.Main;

import java.io.Serializable;

public class Student extends Osoba implements Serializable {

    public String getNumeralbumu() {
        return numerAlbumu;
    }

    String numerAlbumu;

	private static final long serialVersionUID = 1L;

	public Student(){
        System.out.println("podaj numer indeksu");
        numerAlbumu= Main.c.next();

    }

    public Student(String imie, String nazwisko ,int wiek, String pesel, String numerAlbumu){
	    super(imie,nazwisko,wiek,pesel);
	    this.numerAlbumu=numerAlbumu;

    }


	public static void dodajStudenta(Student nowyStudent){

	}
	
}
