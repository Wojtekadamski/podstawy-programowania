package PACKAGE_NAME;

import java.util.ArrayList;

public abstract class Zwierzeta {
    String rodzaj;
    String gatunek;
    String rasa;
    String imie;
    int wiek;
    boolean czySzczepione;
    boolean czyNakarmione = false;
    ArrayList<Zwierzeta>
    public Zwierzeta(){
        rodzaj=" ";
        gatunek=" ";
        rasa=" ";
        imie=" ";
        wiek=0;
        czySzczepione=false;
    }

    public Zwierzeta(String rodzaj, String gatunek, String rasa, String imie, int wiek, boolean czySzczepione){
        this.rodzaj=rodzaj;
        this.gatunek=gatunek;
        this.rasa=rasa;
        this.imie=imie;
        this.wiek=wiek;
        this.czySzczepione=czySzczepione;
    }
    public String getRasa() {
        return rodzaj;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
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

    public void nakarm(){
    if (isCzyNakarmione()==true)
        System.out.println("Zwierzę jest nakarmione");
    else{
        setCzyNakarmione(true);
        System.out.println("zwierzę zostało nakarmione");
    }
    }

    public void dodajZwierze(){

    }

}
