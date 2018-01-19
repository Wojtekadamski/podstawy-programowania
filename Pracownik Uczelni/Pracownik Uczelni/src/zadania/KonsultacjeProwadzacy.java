package zadania;

import osoby.PracownikUczelni;
import osoby.Student;
import pakietStartowy.Main;

import java.io.Serializable;
import java.util.StringTokenizer;



public class KonsultacjeProwadzacy implements Serializable {

/** zmienne dotyczące studentów
    PracownikUczelni jakiWykladowca;
    int czasPotrzebnyMinimalny;
    int getCzasPotrzebnyMaksymalny;
    char priorytet; // określany jako l-low, n-normal, h-high
   -------------------------*/


	String day;
	int hour;
	int minute;
	static final int CZTRWANIA = 90;
	private Student studentsSignedUp[] = new Student[0];
	
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

            tempKonsultacje = Main.c.next();
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
	
	public boolean zapisNaKonsultacje(Student nowyStudent) {

        if (studentsSignedUp.length <= 30) {

            Student.dodajStudenta();
            return true;

        } else {

            return false;

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
	

