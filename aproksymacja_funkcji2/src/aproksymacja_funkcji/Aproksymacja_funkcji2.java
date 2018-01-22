package aproksymacja_funkcji;
import PackageMath.*;
public class Aproksymacja_funkcji2 {
	static double x=1;
	static int eps=100;
	
	public Aproksymacja_funkcji2(double x, int eps) {
		this.x=x;
		this.eps=eps;
	}
	
	public static double epx() {
	      double pl = 1;
	      double pm = 1;
	      double suma = 1;
	      for (int n = 1; n <= eps; n++) {
	    	  
	            pl =Potega.potega(x,n);
	            pm =Silnia.silnia(n);
	            suma += pl/pm;
	      }
	      return suma;
	}
	
	
	public static double sin() {
		double pl=x;
		double pm=1;
		double suma=x;
		
		for(int n=1;n<=eps; n++) {
			pl=Potega.potega(x, 2*n+1);
			pm=Silnia.silnia(2*n+1);
			if(n%2==0) {suma+=(pl/pm);}
			else {suma-=(pl/pm);}									
		}
		return suma;
	}
	
	public static double cos()
	{
	  double
	    suma = 1,
	    pl = 1,
	    pm = 1;
	    for(int n=1; n<=eps; n++)
	    {
	    	pl =Potega.potega(x, 2*n);
	    	pm =Silnia.silnia(2*n);
	 
	    	if(n%2==0) suma+=(pl/pm);
	    	else suma-=(pl/pm);
	    }
	    return suma;
	}
	
}
