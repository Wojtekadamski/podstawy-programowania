import java.io.Serializable;

public class Kotowate  extends Zwierzeta implements Domowe, Serializable {
    private static final long serialVersionUID = 10L;
    String rasa;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public boolean isCzyNaHaju() {
        return czyNaHaju;
    }

    public void setCzyNaHaju(boolean czyNaHaju) {
        this.czyNaHaju = czyNaHaju;
    }

    boolean czyNaHaju;

    @Override
    public void poglaskaj() {

    }

    @Override
    public void zaadoptuj() {
        System.out.println("zaadoptowano zwierzaka");

    }
    public Kotowate(){
        System.out.println("podaj rase:");
        rasa = Main.c.nextLine();
    }

    public void podajKocimietke(){
        setCzyNaHaju(true);
        System.out.println("kot jest na haju");
    }
}
