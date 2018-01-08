import java.io.Serializable;

public class Egzotyczne extends Zwierzeta implements Serializable {
    public boolean isCzyJadowite() {
        return czyJadowite;
    }

    public void setCzyJadowite(boolean czyJadowite) {
        this.czyJadowite = czyJadowite;
    }

    boolean czyJadowite;

String temp;


    public Egzotyczne() {

        System.out.println("Podaj nazwę szczepionki");
        temp=Main.c.next();
        if(temp.equals("tak"))
            setCzyJadowite(true);
        else
            setCzyJadowite(false);

    }
}
