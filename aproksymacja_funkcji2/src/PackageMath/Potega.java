package PackageMath;

public class Potega {
public static double potega(double x, int w) {
	if (w == 0)
		return 1;
		return x * potega(x, --w);
}
}
