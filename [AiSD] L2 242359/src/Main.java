import MyCollections.MojaArrayLista;
import MyCollections.MojaListaPolaczona;

import java.util.Iterator;
import java.util.Scanner;
import MyCollections.*;

public class Main {
    public static Scanner c=new Scanner(System.in);

    public static void main(String[] args){
        String string;
        Integer integer;
        Double _double;




/*

        System.out.println("rozmiar tablicy: " + tablica.length());
        System.out.println("wpisz 5 wartości potwierdzając enterem");
        for (int i = 0; i<5;i++) {
            integer = c.nextInt();
            tablica.add(integer);
        }
        System.out.println("rozmiar tablicy: " + tablica.length());

        for(Integer elem: tablica){
            System.out.println(iterator.next());
        }
        System.out.println("index elementu 3");
        System.out.println(tablica.indexOf(7));*/



        /*System.out.println(lista.isEmpty());
        System.out.println("wpisz 5 wartości potwierdzając enterem");
        for (int i = 0; i<5;i++) {
            integer = c.nextInt();
            lista.addEnd(integer);
        }
        System.out.println(lista.isEmpty());
        lista.iterateForward();
        lista.display();

        Integer[] tab = {22,33,44,55,66,77};
        lista.addAtPosAll(tab, 3);


        lista.display();*/



        GrupaZajeciowa grupaZajeciowa = new GrupaZajeciowa();
        int wybor=0;



        while(wybor !=10){
            System.out.println("co chcesz zrobić?");
            System.out.println("1 wczytaj dane");
            System.out.println("2 dodaj");
            System.out.println("3 oblicz średnią dla grupy");
            System.out.println("4 wyświetl wszystkich");
            System.out.println("5 zapisz plik");
            System.out.println("10 zakończ");
            wybor= c.nextInt();
            switch (wybor){
                case 1:
                    grupaZajeciowa.wczytaj();
                    break;
                case 2:
                    grupaZajeciowa.add();
                    break;
                case 3:
                    grupaZajeciowa.srednia();
                    break;
                case 4:
                    grupaZajeciowa.wyswietl();
                    break;
                case 5:
                    grupaZajeciowa.zapiszPlik();
                    break;
                default:
                    break;



            }
        }


    }

}
