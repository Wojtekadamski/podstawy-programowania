import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GrupaZajeciowa {
    public static Student student[];
/**
    public GrupaZajeciowa() {

        student = new Student[0];

    }


    public void dodajStudenta() {

        Student nowyStudent = null;

        nowyStudent = new Student();


        //Rozszeżanie tablicy studentów za pomocą tablicy pomocniczej
        Student arrHolder[] = new Student[student.length + 1];

        for (int i = 0; i < student.length; i++) {

            arrHolder[i] = student[i];

        }

        arrHolder[student.length] = nowyStudent;      //dopisanie nowego studenta
        student = arrHolder;                          //"przepisanie" tablicy
        arrHolder = null;                               // wyzerowanie tablicy pomocniczej

    }


    public void usunStudenta() {

        if(0 < student.length) {
            System.out.print("podaj imie: ");
            String name = Main.c.next();
            System.out.print("Podaj nazwisko: ");
            String surname = Main.c.next();

            for(int i = 0; i < student.length; i++) {

                if(student[i].getImie().equals(name) && student[i].getNazwisko().equals(surname)) {

                    if(0 < student.length) {

                        Student arrHolder[] = new Student[student.length - 1];

                        for(int j = 0; j < student.length; j++) {

                            if(j < i) {

                                arrHolder[j] = student[j];

                            } else if( i < j) {

                                arrHolder[j - 1] = student[j];

                            }

                        }

                        student = arrHolder;
                        arrHolder = null;

                        System.out.println("Student usunięty");

                    }

                }

            }
        } else {

            System.out.println("Nie masz żadnych studentów");

        }

    }




  public double sredniaDlaGrupy(){
        double suma = 0;
        for(int i = 0;i<=student.length;i++){
            suma+=student[i].getOcena();
        }

    return suma;}
*/


private ArrayList<Student> array;

    public GrupaZajeciowa() {
        array = new ArrayList<Student>();
    }

    public void add() {
        Student s = new Student();
        array.add(s);
    }

    public void zapisz() {
        try {
            PrintWriter zapisz = new PrintWriter(new File("studenci.txt"));
            zapisz.println(array.size());
            for (Student student : array) {
                zapisz.println(student);
            }
            zapisz.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void wczytaj() {
        try {
            Scanner odczyt = new Scanner(new FileReader("studenci.txt"));
            int rozm = odczyt.nextInt();

            for (int i = 0; i < rozm; i++) {
                Student s = new Student();
                s.wczytaj(odczyt);
                array.add(s);
            }
            odczyt.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void srednia() {
        double srednia = 0;
        for (Student student : array) {
            srednia += student.getOcena();
        }
        System.out.println();
        System.out.println("srednia " + srednia / array.size());
    }



    public void zmien() {
        String nrindexu;
        int ocena;
        nrindexu=Main.c.next();
        ocena = Main.c.nextInt();
        System.out.println();
        Iterator<Student> it = array.iterator();
        boolean znaleziono=false;
        while (it.hasNext()) {
            Student akt=it.next();
            if (akt.getNrIndeksu().equals(nrindexu))
            {
                System.out.print("zmieniam ocene studenta "+akt+" z "+akt.getOcena()+" na ");
                akt.setOcena(ocena);
                znaleziono=true;
                System.out.println(akt.getOcena());
            }
        }
        if(!znaleziono)
        {
            System.out.println("nie znaleziono indexu "+nrindexu);
        }

    }

    public void wyswietl() {
        Iterator<Student> it = array.iterator();
        System.out.println();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

}
