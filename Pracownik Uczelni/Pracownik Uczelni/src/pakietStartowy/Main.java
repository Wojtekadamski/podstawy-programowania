package pakietStartowy;

import java.util.Scanner;
import uczelnia.Uczelnia;

public class Main {
	public static Uczelnia uczelnia = new Uczelnia();
	public static final Scanner c = new Scanner(System.in);
	
	public static void main(String[] args) {



		
		int wybor = 0;
		
		while(wybor != 11) {
			
			System.out.println();
			System.out.println("Co chcesz zrobić:\n");
			System.out.println("1.Dodaj pracownika");
			System.out.println("2.usuń pracownika");
			System.out.println("3.znajdż i wyświetl pracownika");
			System.out.println("4.wyświetl wszystkich");
			System.out.println("5.Wyeksportuj pracowników do pliku");
			System.out.println("6.Zaimportuj pracowników z pliku");
			System.out.println("7.Zapisz i zacznij od nowa");
			System.out.println("8.dodaj studenta");
			System.out.println("9. generuj studenta");
            System.out.println("10.wyświetl studenta");
            System.out.println("11.zakończ");
			System.out.print("Twój wybór: ");
			
			String wyborString = c.next();

			try {

				wybor = Integer.parseInt(wyborString);

			} catch(NumberFormatException nfe) {

				wybor = 0;

			}
			
			switch(wybor) {
				
				case 1:
					uczelnia.dodajPracownika();
					break;
					
				case 2:
					uczelnia.usunPracownika();
					break;
					
				case 3:
					uczelnia.szukajPracownika();
					break;
					
				case 4:
					uczelnia.wyswietlWszystkich();
					break;
					
				case 5:
					uczelnia.eksportuj();
					break;
					
				case 6:
					uczelnia.importuj();
					break;
					
				case 7:
					uczelnia.eksportuj();
					uczelnia.clear();
					break;

				case 8:
					uczelnia.dodajStudenta();
					break;

				case 9:
					uczelnia.generujStudenta();
					break;

                case 10:
                    uczelnia.wyswietlStudenta();
                    break;
			
			}
			
		}
		
		c.close();
		
	}
	
}
