// Computes an approximation of PI

public class CalcPi {
	public static void main(String [] args) { 
		int j = Integer.parseInt(args[0]);
	    double a = Math.PI;
		int b = 0;
		int v = 1;
		double s = 1;
		double dif = 0;
	while ( b < j){
		double x = 1 / s;
		dif = dif + (x * v);
		v = v * (-1);
		s = s + 2;
		b = b + 1;
	}
	System.out.println("pi according to Java: " + a);
	System.out.println("pi, approximated:     " + (double)(dif * 4));
	}
}
