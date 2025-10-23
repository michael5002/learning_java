public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 6));
        System.out.println(shouldWakeUp(true, 24));
        System.out.println(shouldWakeUp(true, 3));
        System.out.println(shouldWakeUp(false, 20));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return  barking  && (hourOfDay < 8 || hourOfDay > 22);

   }



}
