public class MegaByteConverter {
    public static void main(String[] args) {
        convertToMegaBytes(3445);
        convertToMegaBytes(7868);
        convertToMegaBytes(2500);
        convertToMegaBytes(6675);
        convertToMegaBytes(2005);
        convertToMegaBytes(0);
        convertToKiloBytes(600);
        convertToKiloBytes(0);
        convertToKiloBytes(45);
        convertToKiloBytes(-45);
    }
    


    public static void convertToMegaBytes(int kiloBytes){
        System.out.println( "KiloByte To MegaByte: ");
        int megaByte = kiloBytes/1024;
        int remainKB = kiloBytes % 1024;
        
       if (kiloBytes <= 0){
           System.out.println("Invalid Value");
           return;
       }
        System.out.println(kiloBytes + "KB = " + megaByte + "MB and " + remainKB + "KB");
       }
      
   

   public static void convertToKiloBytes(int megaByte){
    System.out.println("MegaByte To KiloByte: ");
    int kiloBytes = megaByte * 1024;

    if (megaByte <= 0){
        System.out.println("Invalid Value");
        return;
    }
    System.out.println(megaByte + "MB = " + kiloBytes + "KB");

   }
}

