

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Zwierzeta implements Serializable {
    private static final long serialVersionUID = 10L;
    String rodzaj;
    String gatunek;
    Szczepionka szczepionka;
    String imie;
    int wiek;
    boolean czySzczepione;
    boolean czyNakarmione = false;

    public Zwierzeta(){
        System.out.println("podaj rodzaj zwierzecia:");
        rodzaj=Main.c.next();
        System.out.println("podaj gatunek: ");
        gatunek=Main.c.next();

        System.out.println("Podaj imie:");
        imie = Main.c.next();
        System.out.println("Podaj wiek:");
        wiek = Main.c.nextInt();
        System.out.println("Czy szczepiony?:");
        String wybor=Main.c.next();
        if(wybor.equals("tak")) {
            setCzySzczepione(true);
            new Szczepionka();
        }
            else setCzySzczepione(false);

    }

    public Zwierzeta(String rodzaj, String gatunek, String rasa, String imie, int wiek, boolean czySzczepione){
        this.rodzaj=rodzaj;
        this.gatunek=gatunek;

        this.imie=imie;
        this.wiek=wiek;
        this.czySzczepione=czySzczepione;
    }


    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isCzySzczepione() {
        return czySzczepione;
    }

    public void setCzySzczepione(boolean czySzczepione) {
        this.czySzczepione = czySzczepione;
    }

    public boolean isCzyNakarmione() {
        return czyNakarmione;
    }

    public void setCzyNakarmione(boolean czyNakarmione) {
        this.czyNakarmione = czyNakarmione;
    }


public String toString() {return " rodzaj: " + getRodzaj() + "\tgatunek: " + getGatunek() + " \timie: " + getImie() + " \twiek: " + getWiek();}


}
