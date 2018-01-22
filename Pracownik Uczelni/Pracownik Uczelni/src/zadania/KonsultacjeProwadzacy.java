package zadania;

import osoby.PracownikNaukowoDydaktyczny;
import osoby.Student;
import pakietStartowy.Main;

import java.io.Serializable;
import java.util.StringTokenizer;



public class KonsultacjeProwadzacy implements Serializable {
    private static final long serialVersionUID = 1L;
/** zmienne dotyczące studentów
    PracownikUczelni jakiWykladowca;
    int czasPotrzebnyMinimalny;
    int getCzasPotrzebnyMaksymalny;
    char priorytet; // określany jako l-low, n-normal, h-high
   -------------------------*/


	String day;
	int hour;
	int minute;

	private Student[] studentsSignedUp = new Student[0];
	
	public KonsultacjeProwadzacy() {

	    String godzina= "0";
	    String minuta= "0";
        String tempKonsultacje = "";
        int liczbaTokenow;
       boolean czyPoprawne=false;
        String podzial = new String(tempKonsultacje);
        String[] podzieloneWyrazy = new String[3];

	    while (czyPoprawne == false){
            System.out.print("Kiedy są konsultacje (w formacie dzień hh mm)");

            tempKonsultacje = Main.c.nextLine();
            StringTokenizer st = new StringTokenizer(tempKonsultacje);
            liczbaTokenow = st.countTokens();
            if (liczbaTokenow == 3){
                for (int i = 0; i < 3; i++) {
                    podzieloneWyrazy[i] = st.nextToken();
                }
                czyPoprawne = true;
            }

            else {
                System.out.println("błędny format");
                czyPoprawne = false;
            }

            if(isInteger(podzieloneWyrazy[1]) == false && isInteger(podzieloneWyrazy[2]) == false) {
                System.out.println("zły format godziny");
                czyPoprawne = false;
            }
                else {
                godzina=podzieloneWyrazy[1];
                minuta=podzieloneWyrazy[2];
                if (Integer.parseInt(godzina)<0 || Integer.parseInt(godzina)>23)
                {
                    System.out.println("zakres godziny to [0,23]");
                    czyPoprawne = false;
                }
                if (Integer.parseInt(minuta)<0 || Integer.parseInt(minuta)>59){
                    System.out.println("zakres minut to [0,59]");
                    czyPoprawne = false;
                }
            }
        }
        day = podzieloneWyrazy[0];
        hour = Integer.parseInt(godzina);
        minute = Integer.parseInt(minuta);
    }

	public void zapisNaKonsultacje(Student nowyStudent, PracownikNaukowoDydaktyczny prac) {

        if (studentsSignedUp.length <= 30 && prac.getCzasPozostaly()> nowyStudent.konsultacjeStudent.czasPotrzebnyMinimalny ) {
            prac.setCzasPozostaly(prac.getCzasPozostaly()-nowyStudent.konsultacjeStudent.czasPotrzebnyMinimalny);
            //Rozszeżanie tablicy pracowników za pomocą tablicy pomocniczej
            Student arrHolder[] = new Student[studentsSignedUp.length + 1];

            for(int i = 0; i < studentsSignedUp.length; i++) {

                arrHolder[i] = studentsSignedUp[i];

            }

            arrHolder[studentsSignedUp.length] = nowyStudent;      //dopisanie nowego pracownika
            studentsSignedUp = arrHolder;                          //"przepisanie" tablicy
            arrHolder = null;                               // wyzerowanie tablicy pomocniczej



        } else {
            System.out.println("brak miejsc");


        }

    }
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

}
	

