

import com.sun.javafx.tools.packager.Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import MyCollections.*;

public class GrupaZajeciowa {
    public static Student student[];

    public static Scanner c=new Scanner(System.in);
    MojaArrayLista<Student> array;
    MojaListaPolaczona<Student> list;


//public ArrayList<Student> array;

    public GrupaZajeciowa() {
        array =  new MojaArrayLista<>();
        list = new MojaListaPolaczona<>();
    }

    public void add() {
       Student s = new Student();
        array.add(s);
    }
/*
    public void zapisz() {
        try {
            PrintWriter zapisz = new PrintWriter(new File("studenci.txt"));
            zapisz.println(array.size());
            for (Student student : array) {
                zapisz.toString(student);
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
*/


public void wczytaj(){
    Scanner odczyt = null;
    Student student1;
    String[] temp = new String[10];
    try {
        odczyt = new Scanner(new FileReader("studenci.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    StringTokenizer studentToken;
    while(odczyt.hasNextLine()){
        studentToken = new StringTokenizer(odczyt.nextLine(),",");

        for(int i= 0; i<10; i++)
            temp[i]= (String) studentToken.nextToken();

        student1 = new Student(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Integer.parseInt(temp[8]), Integer.parseInt(temp[9]));
        array.add(student1);
        list.addEnd(student1);
    }
}


    public  void zapiszPlik() {


        Path sciezka = Paths.get("studenci.txt");
        ArrayList<String> out = new ArrayList<>();
        Iterator<Student> iterator = array.iterator();


        try {
        while (iterator.hasNext()) {
            String s = iterator.next().toString();

            s = s.replace("[", "");
            s = s.replace("]", "");
            s = s.replace(" ", ",");

            // dodanie linijki z danymi do listy
            out.add(s);



            Files.write(sciezka, out);
        }
    } catch (IOException ex) {
            System.out.println("Nie mogę zapisać pliku!");
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
        nrindexu= c.next();
        ocena = c.nextInt();
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
        Iterator<Student> iter = array.iterator();
        System.out.println();
        Student student1;

        while (iter.hasNext()) {
            student1 = iter.next();
            System.out.println(student1.getImie() +" "+ student1.getNazwisko() +" "+ student1.getNrIndeksu() +" "+ student1.getOcena());
        }
        System.out.println();
        //list.iterateForward();

    }


}
