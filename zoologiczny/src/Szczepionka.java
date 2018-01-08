import java.io.Serializable;

public class Szczepionka implements Serializable {

    String nazwa;
    String naCoDziala;
    int objetosc;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNaCoDziala() {
        return naCoDziala;
    }

    public void setNaCoDziala(String naCoDziala) {
        this.naCoDziala = naCoDziala;
    }

    public int getObjetosc() {
        return objetosc;
    }

    public void setObjetosc(int objetosc) {
        this.objetosc = objetosc;
    }

        public Szczepionka(){
            System.out.println("Podaj nazwę szczepionki");
            nazwa=Main.c.next();

            System.out.println("Podaj na co działa szczepionki");
            naCoDziala=Main.c.next();

            System.out.println("Podaj objętość szczepionki");
            objetosc=Main.c.nextInt();
        }


}
