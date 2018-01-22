package aproksymacja_funkcji;



class Aproksymacja_funkcji {
	static double x=1;
	static int eps=100;
	
	public Aproksymacja_funkcji(double x, int eps) {
		this.x=x;
		this.eps=eps;
	}
	
	public static double epx() {
		
	      double pl = 1;
	      double pm = 1;
	      double suma = 0;
	      for (int n = 1; n <= eps; n++) {

	         if (n > 1) {
	            pl *= x;
	            pm *= (n - 1);
	         }

	         suma += pl/pm;
	      }
	      return suma;
	}
	
	public static double sin() {
		double x1=x;
		while(x1>2*3.1415) {
			x1/=3.1415;
		}
		
		double pl=x1;
		double pm=1;
		double suma=x1;
		
		for(int n=1;n<=eps; n++) {
			pl*=x1*x1;
			pm*=(2*n)*(2*n+1);
			
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
	    	
	    	pl *=x*x;
	    	pm *=(n*2-1)*(n*2);
	    	if(n%2==0) {suma+=(pl/pm);}
			else {suma-=(pl/pm);}
	    }
	    return suma;
	}
	
}
