import java.io.Serializable;

public class Psowate extends Zwierzeta implements Domowe, Serializable {
    private static final long serialVersionUID = 10L;
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    String rasa;

    @Override
    public void poglaskaj() {
        System.out.println("piesek został pogłaskany");
    }

    @Override
    public void zaadoptuj() {

    }

    public Psowate() {

        System.out.println("podaj rase:");
        rasa = Main.c.next();
    }
}
