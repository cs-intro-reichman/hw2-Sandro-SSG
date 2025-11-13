// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int b = Integer.parseInt(args[0]);
	    double a = Math.PI;
		int c = (b*2) - 3;
		int j = (b*2) - 1;
		double sum = 0;
		double dif = 0;
		for( int i = 1; i < b; i += 4){
		double d = (double)1 / i;
		sum += d;
		}
		for( int f = 3; f < b; f += 4){
		double d = (double)1 / f;
		dif += d;
		}
		System.out.println( "pi according to Java: " + a);
		System.out.println( "pi, approximated: " + (sum - dif) * 4);
		
}
}
