package osoby;

import pakietStartowy.Main;

import java.io.Serializable;

public class Student extends Osoba implements Serializable {

    public String getNumeralbumu() {
        return numeralbumu;
    }

    String numeralbumu;

	private static final long serialVersionUID = 1L;

	public Student(){
        System.out.println("podaj numer indeksu");
        numeralbumu= Main.c.next();


    }


	public static void dodajStudenta(Student nowyStudent){

	}
	
}
