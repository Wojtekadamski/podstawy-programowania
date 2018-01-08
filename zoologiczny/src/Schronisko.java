import java.io.*;

public class Schronisko {
    Zwierzeta zwierze[];

    public Schronisko(){
        zwierze = new Zwierzeta[0];
    }

    public <T extends Zwierzeta> void nakarm(T object){
        if (object.isCzyNakarmione()==true)
            System.out.println("Zwierzę jest nakarmione");
        else{
            object.setCzyNakarmione(true);
            System.out.println("zwierzę zostało nakarmione");
        }
    }


    public boolean dodajZwierze(){
        int wybor = 0;
        while(wybor != 1 && wybor != 2 && wybor !=3) {

            System.out.println("1.kot czy 2.pies 3.egzotyczne?");

            wybor = Main.c.nextInt();
        }

        Zwierzeta noweZwierze ;

        switch(wybor) {
            case 1:
                noweZwierze = new Psowate();
                break;
            case 2:
                noweZwierze = new Kotowate();
                break;
            case 3:
                noweZwierze = new Egzotyczne();
                break;
                default:
                    noweZwierze = null;

        }
        if (noweZwierze.equals(null))
            return false;
        //Rozszeżanie tablicy pracowników za pomocą tablicy pomocniczej
        Zwierzeta arrHolder[] = new Zwierzeta[zwierze.length + 1];

        for(int i = 0; i < zwierze.length; i++) {

            arrHolder[i] = zwierze[i];

        }

        arrHolder[zwierze.length] = noweZwierze;      //dopisanie nowego pracownika
        zwierze = arrHolder;                          //"przepisanie" tablicy
        arrHolder = null;                               // wyzerowanie tablicy pomocniczej

return true;
    }


    public void wyswietlZwierzaka(Zwierzeta zwierze) {

        System.out.println();
        System.out.println(zwierze);

    }

    public void wyswietlWszystkich() {

        if(0 < zwierze.length) {

            for(Zwierzeta employee : zwierze) {

                wyswietlZwierzaka(employee);

            }

        } else {

            System.out.println("Nie masz żadnych zwierząt w bazie");

        }

    }

    //serializacja danych
    public void eksportuj() {


        try {

            ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("zwierzeta.ino"));

            objectStream.writeObject(zwierze);
            objectStream.close();

        } catch(Exception ex) { ex.printStackTrace(); }

    }

    //deserializacja danych
    public void importuj() {


        try {

            ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("zwierzeta.ino"));
            zwierze = (Zwierzeta []) objectStream.readObject();
            objectStream.close();
            System.out.println("pracownicy zaimportowani");

        } catch(FileNotFoundException fnfe) {

            System.out.println("Brak pliku");

        }catch(Exception ex) { ex.printStackTrace(); }

    }


}
