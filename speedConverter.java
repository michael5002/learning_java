
public class speedConverter {
    public static void main(String[] args) {
      
        printConversion(7);
        printConversion(0);
        printConversion(4.5);
        printConversion(13.8);
        printConversion(16);
        printConversion(-8);

        System.out.println("Miles to Kilometer:");
        printMliesConversion(12);
        printMliesConversion(-3.4);
        printMliesConversion(19);
        printMliesConversion(9);
        printMliesConversion(3);
    }
    
    
   
 public static long toMilesPerHour(double kilometersPerHour ) {
        
        if (kilometersPerHour <= 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
 
    public static void printConversion(double kilometersPerHour) {
        
        if (kilometersPerHour <= 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        
    }
 
    public static long toKilometersPerHour(double milesPerHour){
        if (milesPerHour <= 0 ){
            return -1;
        }
        return Math.round(milesPerHour * 1.609);
    }

    public static void printMliesConversion(double milesPerHour){
        if (milesPerHour <= 0){
            System.out.println("Invalid Input");
            return;
        }
        long kilometersPerHour = toKilometersPerHour(milesPerHour);
        System.out.println(milesPerHour + "mi/h " + "=" + kilometersPerHour + "km/h"); 
    }
}

