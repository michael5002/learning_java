public class SumEvenDigit {
    public static void main(String[] args) {
         System.out.println(sumDigits(123));
         System.out.println(sumDigits(245));
         System.out.println(sumDigits(-22));
        
    }
     public static int sumDigits(int num){
        int sum = 0;

        if(num <=0){ //check if the number is less than or equal to 0.
            return -1; 
        }
        while(num >=1){
            int pam = num%10;

            if(pam%2 == 0){ //check if the last digit is even.
                sum+= num %10; // if it is even, it's added to sum.
            }

            num /= 10;
        }
        return sum;

    }
}