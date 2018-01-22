package PackageMath;

public class Pi {
		
	public static double pi() {
		double x=1;
		int pm=1;
		 for(int i=0; i<100; i++) {
			 pm=pm+2;
			if( i%2==0) x-=(1/pm); else  x+=(1/pm);
		 }
		 x=x*4;
		 return x;
	}

}
