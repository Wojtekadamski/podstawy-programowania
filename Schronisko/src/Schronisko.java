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


        System.out.println(zwierze);

    }

    public void wyswietlWszystkich() {

        if(0 < zwierze.length) {

            for(int i=0; i<zwierze.length;i++) {

                System.out.print("\t\t" + ++i + "\t\t"); i--; wyswietlZwierzaka(zwierze[i]);

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
            System.out.println("zwierzęta zaimportowane");

        } catch(FileNotFoundException fnfe) {

            System.out.println("Brak pliku");

        }catch(Exception ex) { ex.printStackTrace(); }

    }


    public void opcjeZwierzaka(){
        int wybor=0;
        boolean poprawne = false;
        wyswietlWszystkich();
        System.out.println("którego zwierzaka opcje pokazać? ");
        while(poprawne != true){
            wybor=Main.c.nextInt();
            try {
                if (zwierze[wybor-1].getRodzaj().equals("pies")) {
                    opcjePsa();
                    poprawne = true;
                }
                else {
                    if (zwierze[wybor - 1].getRodzaj().equals("kot")) {
                        opcjeKota();
                        poprawne = true;
                    }
                    else {
                        if (zwierze[wybor - 1] instanceof Zwierzeta) {
                            opcjeEgzotycznego();
                            poprawne = true;
                        } else System.out.println("błędne dane");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException aioobe)
            {
                System.out.println("błędne dane, wpisz pomiędzy 1 a " + zwierze.length);
            }
        }
    }

    private void opcjeEgzotycznego() {
        System.out.println("brak opcji");
    }

    private void opcjeKota() {
        System.out.println("opcje kota");
    }

    private void opcjePsa() {
        System.out.println("opcje psa");
    }


}
