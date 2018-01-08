package zadania;

import osoby.*;
import pakietStartowy.*;
import uczelnia.*;
import zadania.*;

import static uczelnia.Uczelnia.student;



public class GeneratorOsob extends Osoba {
    //23 imiona i nazwiska
  public static String[][] imionaINazwiska= {
            {"Marek", "Wojciech", "Mieszko", "Barbara", "Michał", "Tomasz", "Radosław", "Edward", "Mateusz", "Anna", "Aleksandra", "Olga", "Weronika", "Zofia", "Andrzej", "Jarosław", "Wiktoria", "Jadwiga","Krzysztof", "Bartosz", "Eryk", "Kamil", "Filip", },
            {"Adamski", "Bratos", "Andrzejewski", "Kowalski", "Nowak", "Bartos", "Radosz", "Pastuszek", "Dębogórski","Waszkiewicz", "Klebański", "Brzeza", "Domagała", "Pishing", "Urban", "Jacak", "Ferec", "Talar", "Berg", "Operacz", "Piątek", ""}
    };


    public static void generujStudenta(){
        int ileStudentowGenerowac;
        System.out.printf("ilu studentów wygenerować?");
        ileStudentowGenerowac = Main.c.nextInt();
Integer pesel1;
Integer pesel2;
Integer pesel3;
Integer numer1, numer2;

        for(int i=0;i<ileStudentowGenerowac;i++) {
            Student nowyStudent = new Student(imionaINazwiska[0][(int)(Math.random()*23)], imionaINazwiska[1][(int)(Math.random()*23)], ((int)(Math.random()*6)+19), (pesel1=(int)(Math.random()*9999)).toString()+(pesel2=(int)(Math.random()*9999)).toString()+(pesel3=(int)(Math.random()*999)).toString(), (numer1=(int)(Math.random()*9999)).toString()+(numer2=(int)(Math.random()*9999)).toString() );


            Student arrHolder[] = new Student[student.length + 1];

            for (int j = 0; j < student.length; j++) {

                arrHolder[j] = student[j];

            }

            arrHolder[student.length] = nowyStudent;      //dopisanie nowego pracownika
            student = arrHolder;                          //"przepisanie" tablicy
            arrHolder = null;                               // wyzerowanie tablicy pomocniczej

        }

    }


}
