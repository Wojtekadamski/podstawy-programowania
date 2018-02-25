import java.util.Scanner;

public class Student {
    private String imie;
    private String nazwisko;
    private String nrIndeksu;
    private int semestrStudiow;
    private int rokStudiow;
    private int liczbaPunktowUzyskanych;
    private int sumaPunktow;
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

//   public double setOcena(int punkty){
//        if ()
//   }

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
    System.out.println("podaj liczbaPunktowUzyskanych");
    this.liczbaPunktowUzyskanych=Main.c.nextInt();


}

    public Scanner wczytaj(Scanner odczyt) {
        nrIndeksu = odczyt.next();
        imie = odczyt.next();
        nazwisko = odczyt.next();
        ocena = odczyt.nextInt();
        return odczyt;
    }


    @Override
    public String toString() {
        return nrIndeksu + " " + imie + " " + nazwisko + " " + ocena;
    }
}
