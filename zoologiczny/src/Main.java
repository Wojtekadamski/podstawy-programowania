import java.util.Scanner;

public class Main {
public static final Scanner c = new Scanner(System.in);
    public static void main(String[] args){
    Schronisko schronisko = new Schronisko();

        int wybor = 0;
        while( wybor !=9){
            System.out.println("co chcesz zrobić?\n 1.dodaj zwierze\n 2. zobacz opcje zwierzęcia\n 7.zapisz zwierzeta\n 8.wczytaj zwierzeta\n 9.zakoncz");
            wybor = c.nextInt();

        switch (wybor){
            case 1:
                schronisko.dodajZwierze();
                break;
            case 2:
                schronisko.wyswietlWszystkich();
                break;
            case 7:
                schronisko.eksportuj();
                break;
            case 8:
                schronisko.importuj();
                break;

        }
        }



    }
}
