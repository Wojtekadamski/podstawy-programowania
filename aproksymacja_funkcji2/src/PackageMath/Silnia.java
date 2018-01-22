package PackageMath;

public class Silnia {

	public static double silnia(int x) {
		if(x == 0) return 1;
		
		else return x * silnia(x - 1);
	}
}
