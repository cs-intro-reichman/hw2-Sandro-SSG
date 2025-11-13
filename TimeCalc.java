public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd ;  
        int hours1 = totalMinutes / 60; 
        int hours2 = hours1 % 24;
        int minutes1 = totalMinutes - (hours1 * 60); 
        if(minutes1 < 10){
            if(hours2 < 10){
                System.out.println("0" + hours2 + ":0" + minutes1);
            }else{
            System.out.println(hours2 + ":0" + minutes1);
            }
        }else{
            if(hours2 < 10){
                System.out.println("0" + hours2 + ":" + minutes1);
            }else{
        System.out.println(hours2 + ":" + minutes1);
        }
        }
    }
}