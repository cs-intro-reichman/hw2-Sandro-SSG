//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            int num = Integer.parseInt(args[1]);
            String upperCase =  name.toUpperCase(); 
            String m = "AEFHILMNORSX";
            for(int i = 0; i <= (name.length() - 1); i++){
                int ch = upperCase.charAt(i);
                if (m.indexOf(ch) != -1 ){
                        System.out.println("Give me an " + upperCase.charAt(i) + ": " + upperCase.charAt(i) + "!"); 
                }else{
                        System.out.println("Give me a  " + upperCase.charAt(i) + ": " + upperCase.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for( int q = 0; q < num; q++ ){
                System.out.println(upperCase + "!!!");
            }

        }
}
