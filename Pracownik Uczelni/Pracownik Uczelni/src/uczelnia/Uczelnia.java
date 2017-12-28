package uczelnia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import osoby.PracownikAdministracyjny;
import osoby.PracownikNaukowoDydaktyczny;
import osoby.PracownikUczelni;
import osoby.Student;
import pakietStartowy.Main;
import zadania.GeneratorOsob;

public class Uczelnia {

	 PracownikUczelni pracownik[];
    public static Student[] student;
	
	public Uczelnia() {

		pracownik = new PracownikUczelni[0];
		student = new Student[0];
		
	}
	
	public void dodajPracownika() {
		
		
		int wybor = 0;
		while(wybor != 1 && wybor != 2) {
			
			System.out.println("1.Pracownik naukowo-dydaktyczny czy 2.pracownik administracyjny?");
			
			wybor = Main.c.nextInt();
		}
		
		PracownikUczelni nowyPracownik;

		if(wybor == 1) {
            nowyPracownik = new PracownikNaukowoDydaktyczny();
		}
		else {
            nowyPracownik = new PracownikAdministracyjny();
		}
		//Rozszeżanie tablicy pracowników za pomocą tablicy pomocniczej
		PracownikUczelni arrHolder[] = new PracownikUczelni[pracownik.length + 1];
		
		for(int i = 0; i < pracownik.length; i++) {
			
			arrHolder[i] = pracownik[i];
			
		}

		arrHolder[pracownik.length] = nowyPracownik;      //dopisanie nowego pracownika
		pracownik = arrHolder;                          //"przepisanie" tablicy
		arrHolder = null;                               // wyzerowanie tablicy pomocniczej

	}
	
	//znajduje pracownika, który ma być ucunięty i zmienia rozmiar tablicy
	public void usunPracownika() {
		
		if(0 < pracownik.length) {
			System.out.print("podaj imie: ");
			String name = Main.c.next();
			System.out.print("Podaj nazwisko: ");
			String surname = Main.c.next();
			
			for(int i = 0; i < pracownik.length; i++) {
				
				if(pracownik[i].getImie().equals(name) && pracownik[i].getNazwisko().equals(surname)) {

                    if(0 < pracownik.length) {

                        PracownikUczelni arrHolder[] = new PracownikUczelni[pracownik.length - 1];

                        for(int j = 0; j < pracownik.length; j++) {

                            if(j < i) {

                                arrHolder[j] = pracownik[j];

                            } else if( i < j) {

                                arrHolder[j - 1] = pracownik[j];

                            }

                        }

                        pracownik = arrHolder;
                        arrHolder = null;

                        System.out.println("Pracownik usunięty");

                    }
					
				}
				
			}
		} else {
			
			System.out.println("Nie masz żadnych pracowników");
			
		}
		
	}
	

	

	public PracownikUczelni szukajPracownika() {
		
		if(pracownik.length == 0) {
			
			System.out.println("Nie masz żadnych pracowników");
			
			return null;
		}
		
		System.out.print("wyszukaj po: 1.imieniu, 2.Nazwisku, 3.Peselu czy 4.zarobkach: ");
		
		int wybor = 0;
		
		while(wybor < 1 || 4 < wybor) {
			
			wybor = Main.c.nextInt();
				
			}
			

		
		switch(wybor) {
			
			case 1:
				return szukajPoImieniu();
				
			case 2:
				return szukajPoNazwisku();
				
			case 3:
				return szukajPoPeselu();
				
			case 4:
				return szukajPoWyplacie();
		
		}
		
		return null;
	}
	
	public PracownikUczelni szukajPoImieniu() {
		
		System.out.print("Podaj imie: ");
		
		String imie = Main.c.next();
		
		for(PracownikUczelni employee : pracownik) {
			
			if(employee.getImie().equals(imie)) {
				
				String wybor;
				System.out.print("czy wyświetlić dane pracownika?: tak/nie");
				while(!(wybor=Main.c.nextLine()).equals("tak") && !wybor.equals("nie")) {
					
					System.out.println(wybor);
					System.out.println("błąd wprowadzania: ");
					
				}
				if(wybor.equals("tak")) {
                    wyswietlPracownika(employee);
				}
				
				return employee;
			}
			
		}
		
		System.out.println("nie znaliziono pracownika!");
		return null;
	}
	
	public PracownikUczelni szukajPoNazwisku() {
		
		System.out.print("podaj nazwisko: ");

		String nazwisko = Main.c.next();

		for(PracownikUczelni employee : pracownik) {

			if(employee.getNazwisko().equals(nazwisko)) {

                String wybor;
                System.out.print("czy wyświetlić dane pracownika?: tak/nie");
                while(!(wybor=Main.c.nextLine()).equals("tak") && !wybor.equals("nie")) {

                    System.out.println(wybor);
                    System.out.println("błąd wprowadzania: ");

                }
                if(wybor.equals("tak")) {
                    wyswietlPracownika(employee);
                }

                return employee;
			}
			
		}

        System.out.println("nie znaliziono pracownika!");
		return null;
	}
	
	public PracownikUczelni szukajPoPeselu() {
		
		System.out.print("What is their pesel number?: ");
		
		String pesel = Main.c.next();
		
		for(PracownikUczelni employee : pracownik) {
			
			if(employee.getPesel().equals(pesel)) {

                String wybor;
                System.out.print("czy wyświetlić dane pracownika?: tak/nie");
                while(!(wybor=Main.c.nextLine()).equals("tak") && !wybor.equals("nie")) {

                    System.out.println(wybor);
                    System.out.println("błąd wprowadzania: ");

                }
                if(wybor.equals("tak")) {
                    wyswietlPracownika(employee);
                }

                return employee;
			}
			
		}

        System.out.println("nie znaliziono pracownika!");
		return null;
	}
	
	public PracownikUczelni szukajPoWyplacie() {
		
		Double wyplata = 0.0;
		
		while(wyplata == 0.0) {
			
			System.out.print("What is their wage?: ");
			
			wyplata = Main.c.nextDouble();
			

			
		}
		
		for(PracownikUczelni employee : pracownik) {
			
			if(employee.getPensja() == wyplata) {

                String wybor;
                System.out.print("czy wyświetlić dane pracownika?: tak/nie");
                while(!(wybor=Main.c.nextLine()).equals("tak") && !wybor.equals("nie")) {

                    System.out.println(wybor);
                    System.out.println("błąd wprowadzania: ");

                }
                if(wybor.equals("tak")) {
                    wyswietlPracownika(employee);
                }

                return employee;
			}
			
		}

        System.out.println("nie znaliziono pracownika!");
		return null;
	}
	
	public void wyswietlPracownika(PracownikUczelni pracownik) {
		
		System.out.println();
		System.out.println(pracownik);
		
	}
	
	public void wyswietlWszystkich() {
		
		if(0 < pracownik.length) {
			
			for(PracownikUczelni employee : pracownik) {

                wyswietlPracownika(employee);
				
			}
			
		} else {
			
			System.out.println("Nie masz żadnych pracowników w bazie");
			
		}
		
	}
	
	//serializacja danych
	public void eksportuj() {

		
		try {
			
			ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("pracownicy.ino"));

			objectStream.writeObject(pracownik);
			objectStream.close();
			
		} catch(Exception ex) { ex.printStackTrace(); }
		
	}
	
	//deserializacja danych
	public void importuj() {

		
		try {
			
			ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("pracownicy.ino"));
			pracownik = (PracownikUczelni[]) objectStream.readObject();
			objectStream.close();
			System.out.println("pracownicy zaimportowani");
			
		} catch(FileNotFoundException fnfe) {
			
			System.out.println("Brak pliku");
			
		}catch(Exception ex) { ex.printStackTrace(); }
		
	}
	
	public void clear() {

		pracownik = new PracownikUczelni[0];
		
	}


	public void dodajStudenta(){

        Student nowyStudent = new Student();

        //Rozszeżanie tablicy studentów za pomocą tablicy pomocniczej
        Student arrHolder[] = new Student[student.length + 1];

        for(int i = 0; i < student.length; i++) {

            arrHolder[i] = student[i];

        }

        arrHolder[student.length] = nowyStudent;      //dopisanie nowego pracownika
        student = arrHolder;                          //"przepisanie" tablicy
        arrHolder = null;                               // wyzerowanie tablicy pomocniczej

    }


    public void generujStudenta(){
        GeneratorOsob.generujStudenta();


    }

}
