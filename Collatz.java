// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		String q = args[1];
		boolean aa = q.equals("v");
		boolean bb = q.equals("c");
		int a = 1;
		int v = 1;
		int z = 0;
		if(aa){
		if(num == 1){
			int c = (v * 3) + 1;
			int d = c /2;
			int e = d /2;
			int x = 4;
			System.out.println(v + " " + c + " " + d + " " + e + " (" + x + ") ");
		}else{
			int c = (v * 3) + 1;
			int d = c /2;
			int e = d /2;
			int x = 4;
			System.out.println(v + " " + c + " " + d + " " + e + " (" + x + ") ");
			for( int i = 2; i <= num; i++){
				System.out.print(i + " ");
				a = i;
				z = 1;
				while ( a != 1 ) {
					if(a % 2 != 0){
						a *= 3;
						a++;
						z++;
							System.out.print(a + " ");
					}else{
						a /= 2;
						z++;
							System.out.print(a + " ");
				}
			}
			System.out.print( " (" + z + ") ");
			System.out.println();
		}
		}
		}else if( bb ){
				System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
		}else{
			System.out.println("Incorrect value of letter");
		}
	}
}
