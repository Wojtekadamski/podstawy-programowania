import java.util.Scanner;

public class Main {
   public static Scanner c=new Scanner(System.in);
   public static void main(String[] args){

      GrupaZajeciowa grupaZajeciowa = new GrupaZajeciowa();
int wybor=0;



      while(wybor !=9){
         System.out.println("co chcesz zrobić?");
         System.out.println("1 wczytaj dane");
         System.out.println("2 dodaj");
         System.out.println("3 oblicz średnią dla grupy");
         System.out.println("4 wyświetl wszystkich");
         System.out.println("5 zapisz plik");
         System.out.println("9 zakończ");
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
            case 6:
               System.out.println(czyPierwsza());

         }
      }




   }


   public static boolean czyPierwsza(){
      System.out.println("podaj liczbę");
      int zakres = c.nextInt();
      int i,j,do_kad;
      int tablica[] = new int[10000];
int liczba = zakres;

      do_kad = (int) Math.floor(Math.sqrt(zakres));
//inicjuj tablice
      for (i=1; i<=zakres; i++) tablica[i]=i;
//algorytm - sito eratostenesa
      for (i=2; i<=do_kad; i++) {
         if (tablica[i] != 0) {
            j = i+i;
            while (j<=zakres) {
               tablica[j] = 0;
               j += i;
            }
         }
      }
      if(tablica[liczba]==liczba)
         return true;
      else
         return false;

   }


}
