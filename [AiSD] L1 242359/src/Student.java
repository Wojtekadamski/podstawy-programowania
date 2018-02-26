import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String imie;
    private String nazwisko;
    private String nrIndeksu;
    private int semestrStudiow;
    private int rokStudiow;
    private int liczbaPunktowUzyskanych;
    int[][] listyZadan = new int[2][5];
    private int sumaPunktow;
    private  double MAX_PUNKTOW = listyZadan[0][0] + listyZadan[0][1] + listyZadan[0][2] + listyZadan[0][3] + listyZadan[0][4];
    private double ocena;



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public int getSemestrStudiow() {
        return semestrStudiow;
    }

    public void setSemestrStudiow(int semestrStudiow) {
        this.semestrStudiow = semestrStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public int getLiczbaPunktowUzyskanych() {
        return liczbaPunktowUzyskanych;
    }

    public void setLiczbaPunktowUzyskanych(int liczbaPunktowUzyskanych) {
        this.liczbaPunktowUzyskanych = liczbaPunktowUzyskanych;
    }

    public int getSumaPunktow() {
        return sumaPunktow;
    }

    public void setSumaPunktow(int sumaPunktow) {
        this.sumaPunktow = sumaPunktow;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

   public double setOcena(int[][] listyZadan){
       MAX_PUNKTOW = listyZadan[0][0] + listyZadan[0][1] + listyZadan[0][2] + listyZadan[0][3] + listyZadan[0][4];
        setSumaPunktow(listyZadan[1][0]+listyZadan[1][1]+listyZadan[1][2]+listyZadan[1][3]+listyZadan[1][4]);
        if(((double)this.getSumaPunktow()) < MAX_PUNKTOW*0.5){
            return 2.0;
        }
        else{
            if(((double)this.getSumaPunktow()) < MAX_PUNKTOW*0.6 && ((double)this.getSumaPunktow()) >= MAX_PUNKTOW*0.5)
                return 3.0;
            else{
                if(((double)this.getSumaPunktow()) < MAX_PUNKTOW*0.7 && ((double)this.getSumaPunktow()) >= MAX_PUNKTOW*0.6)
                    return 3.5;
                else{
                    if(((double)this.getSumaPunktow()) < MAX_PUNKTOW*0.8 && ((double)this.getSumaPunktow()) >= MAX_PUNKTOW*0.7)
                        return 4.0;
                    else {
                        if(((double)this.getSumaPunktow()) < MAX_PUNKTOW*0.9 && ((double)this.getSumaPunktow()) >= MAX_PUNKTOW*0.8)
                            return 4.5;
                        else
                            return 5.0;
                    }
                }
            }
        }

   }

public Student(){

    System.out.println("podaj imie");
    this.imie=Main.c.next();
    System.out.println("podaj nazwisko");
    this.nazwisko=Main.c.next();
    System.out.println("podaj nrIndeksu");
    this.nrIndeksu=Main.c.next();
    System.out.println("podaj semestr studiów");
    this.semestrStudiow=Main.c.nextInt();
    System.out.println("podaj rokStudiow");
    this.rokStudiow=Main.c.nextInt();
    if(listyZadan[0][0] == 0 || listyZadan[0][1]== 0 || listyZadan[0][2]== 0 || listyZadan[0][3]== 0 || listyZadan[0][4]== 0)
        punktyZaListy(1);
    for(int i=0;i<listyZadan[1].length;i++) {
        System.out.println("podaj liczba Punktow Uzyskanych za listę " + (i + 1));
        this.listyZadan[1][i] = Main.c.nextInt();
    }
    this.ocena = setOcena(this.listyZadan);
}

    public Student(String imie, String nazwisko, String nrIndeksu, int semestrStudiow, int rokStudiow, int lista1, int lista2, int lista3, int lista4, int lista5) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nrIndeksu=nrIndeksu;
        this.semestrStudiow=semestrStudiow;
        this.rokStudiow=rokStudiow;
        if(listyZadan[0][0] == 0 || listyZadan[0][1]== 0 || listyZadan[0][2]== 0 || listyZadan[0][3]== 0 || listyZadan[0][4]== 0)
            punktyZaListy(1);
        this.listyZadan[1][0]=dodajPunkty(listyZadan[0][0], lista1);
        this.listyZadan[1][1]=dodajPunkty(listyZadan[0][1], lista2);
        this.listyZadan[1][2]=dodajPunkty(listyZadan[0][2], lista3);
        this.listyZadan[1][3]=dodajPunkty(listyZadan[0][3], lista4);
        this.listyZadan[1][4]=dodajPunkty(listyZadan[0][4], lista5);
        this.ocena = setOcena(this.listyZadan);



    }

    public void punktyZaListy(){
        for(int i = 0;i<5;i++) {
            System.out.println("podaj punkty za listę " + (i + 1));
            listyZadan[0][i]= Main.c.nextInt();
        }
    }
    public void punktyZaListy(int a){
        for(int i = 0;i<5;i++) {

            listyZadan[0][i]= 5;
        }
    }

    public void zmienPunkty(){
        System.out.println();
    }


    private int dodajPunkty(int element, int punkty){
        if(punkty <= element)
            return punkty;
        else
            return element;

    }

    @Override
    public String toString() {
        return   imie + " " + nazwisko + " " + nrIndeksu + " " + semestrStudiow + " " + rokStudiow + " " + listyZadan[1][0] + " " + listyZadan[1][1] + " " + listyZadan[1][2] + " " + listyZadan[1][3] + " " + listyZadan[1][4] + " " + ocena ;
    }
}
