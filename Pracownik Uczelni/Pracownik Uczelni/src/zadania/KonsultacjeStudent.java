package zadania;

import osoby.*;
import pakietStartowy.Main;
import uczelnia.Uczelnia;

import java.io.Serializable;

public class KonsultacjeStudent implements Serializable {
    private static final long serialVersionUID = 1L;
   public PracownikNaukowoDydaktyczny jakiWykladowca;
    int czasPotrzebnyMinimalny;
    int CzasPotrzebnyMaksymalny;
    int priorytet; // określany jako 0-low, 1-normal, 2-high

    public KonsultacjeStudent(Student student){
        System.out.println("Do jakiego prowadzącego? ");
        if(!Main.uczelnia.szukajPracownika().equals(null)) {
            jakiWykladowca = ((PracownikNaukowoDydaktyczny) Main.uczelnia.szukajPracownika());
            System.out.println("ile potrzeba czasu?(w minutach");
            czasPotrzebnyMinimalny = Main.c.nextInt();
            System.out.println("podaj priorytet");
            priorytet = Main.c.nextInt();

            jakiWykladowca.getKonsultacje().zapisNaKonsultacje(student, jakiWykladowca);
        }

    }



}
