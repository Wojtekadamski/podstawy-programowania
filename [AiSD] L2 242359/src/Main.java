import java.util.Iterator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        String string;
        Integer integer;
        Double _double;


        MojaArrayLista<Integer> tablica = new MojaArrayLista<>(10);
        Iterator<Integer> iterator = tablica.iterator();
        Scanner c = new Scanner(System.in);




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
        System.out.println(tablica.indexOf(7));


        /*MojaListaPolaczona<Integer> lista = new MojaListaPolaczona<>();
        System.out.println(lista.isEmpty());
        System.out.println("wpisz 5 wartości potwierdzając enterem");
        for (int i = 0; i<5;i++) {
            integer = c.nextInt();
            lista.addEnd(integer);
        }
        System.out.println(lista.isEmpty());
        lista.iterateForward();
        lista.display();
*/




    }

}
