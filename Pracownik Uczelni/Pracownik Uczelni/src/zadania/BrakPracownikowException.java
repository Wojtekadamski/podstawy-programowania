package zadania;

public class BrakPracownikowException extends Exception {
    public BrakPracownikowException(){}
    public BrakPracownikowException(String gripe){
        super(gripe);
    }
}
