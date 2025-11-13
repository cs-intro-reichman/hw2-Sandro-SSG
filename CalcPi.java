// Computes an approximation of PI.

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		double approx = (sum - dif) * 4;
        System.out.printf("pi according to Java: %.15f%n", a);
        BigDecimal formatted = new BigDecimal(approx)
                .setScale(16, RoundingMode.DOWN);
        String text = formatted.stripTrailingZeros().toPlainString();
        if (text.endsWith(".")) {
            text += "0";
        }
        System.out.println("pi, approximated:     " + text);
    }
}
