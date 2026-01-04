public class Main {
    public static void main(String[] args) {
        sumFirstAndLastDigit(121);
        sumFirstAndLastDigit(-121);
    }
    public static void sumFirstAndLastDigit(int num){
        if(num <=0){
            System.out.println("Invalid input");
            return ;
            
        }
        int lastD = num % 10; //to get last digit.
        int firstD = num;
        
        while(firstD >10){

            firstD /= 10;
        }
        System.out.println("first digit = " + firstD + ", last digit = " + lastD +"." + "\n sum = " +(lastD + firstD));
    }
}
