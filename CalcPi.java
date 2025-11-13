// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int b = Integer.parseInt(args[0]);
	    double a = Math.PI;
		int c = (b*2) - 1;
		int j = (b*2) - 1;
		double sum = 0;
		double dif = 0;
		for( int i = 1; i <= c; i+= 4){
		double d = (double)1 /(double) i;
		sum += d;
		}
		for( int f = 3; f <= j; f += 4){
		double d = (double)1 / (double)f;
		dif += d;
		}
		System.out.printf("pi according to Java: %.15f%n", a);
        System.out.printf("pi, approximated:     %.14f%n", (sum - dif) * 4);
		
}
}
