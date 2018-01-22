import static java.lang.Math.sqrt;

public class Matematyka {
    public static void main(String[] args){
try {
    System.out.println(pierwiastki(2, 3, 4));
}
catch (ArithmeticException e){
    System.out.println("błąd danych");
//    e.printStackTrace();
}
    }

    public static double delta(double a, double b, double c) throws ArithmeticException
    {
        if (b*b<4*a*c)
            throw new ArithmeticException();
        else
            return b*b - 4*a*c;
    }

    public static String pierwiastki(int a, int b, int c)throws ArithmeticException{
        double x1=0;
        double x2=0;
        x1=((-b-sqrt(delta(a,b,c)))/2*a);
        x2=((-b+sqrt(delta(a,b,c)))/2*a);
        return  "x1= " + x1 + " x2= " + x2;

    }

}
