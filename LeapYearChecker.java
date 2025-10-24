public class LeapYearChecker{
     public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(43000));
    }
    
     public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

   
}