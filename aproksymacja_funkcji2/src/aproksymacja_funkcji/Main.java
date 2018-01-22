package aproksymacja_funkcji;
import java.util.Scanner;
import PackageMath.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		double x;
		int eps;
		System.out.println(Pi.pi());
		System.out.println("wpisz x ");
		
		x=cin.nextDouble();
		System.out.println("wpisz eps");
		eps=cin.nextInt();
		Aproksymacja_funkcji aproksymacja_funkcji=new Aproksymacja_funkcji(x, eps);
		Aproksymacja_funkcji2 aproksymacja_funkcji2=new Aproksymacja_funkcji2(x, eps);
		System.out.println("e do x wynosi: " + Aproksymacja_funkcji.epx());
		System.out.println("sin(x): " + Aproksymacja_funkcji.sin());
		System.out.println("cos(x): " + Aproksymacja_funkcji.cos());
		System.out.println("e do x, korzystajac z pakietu: "+ Aproksymacja_funkcji2.epx());
		System.out.println("sin(x), korzystajac z pakietu: "+ Aproksymacja_funkcji2.sin());
		System.out.println("cos(x), korzystajac z pakietu: "+ Aproksymacja_funkcji2.cos());
		}
}
