package zadania;

import osoby.*;
import pakietStartowy.Main;
import uczelnia.Uczelnia;

import java.io.Serializable;

public class KonsultacjeStudent implements Serializable {
    PracownikUczelni jakiWykladowca;
    int czasPotrzebnyMinimalny;
    int getCzasPotrzebnyMaksymalny;
    int priorytet; // określany jako 0-low, 1-normal, 2-high

    public KonsultacjeStudent(){
        System.out.println("Do jakiego prowadzącego? ");
        jakiWykladowca = Main.uczelnia.szukajPracownika();
        System.out.println("ile potrzeba czasu?(w minutach");
        czasPotrzebnyMinimalny = Main.c.nextInt();
        System.out.println("podaj priorytet");
        priorytet  =  Main.c.nextInt();


    }

}
