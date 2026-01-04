public class PalindromeChecker {
    public static void main(String[] args) {
       isPalindrome(121);
       isPalindrome(121);
       isPalindrome(5121);
       isPalindrome(-121);
    }
     public static boolean isPalindrome(int number){
        int reverse = 0, pent = number;
        while(pent>0 || pent < 0){ //to check for negative values as well.

            int remainder = pent%10;

            reverse = reverse * 10 + remainder;

            pent /= 10;
        }
        if(reverse == number){
            System.out.println(number + " is a palindrome");
            return true;
        }
        System.out.println(number + " is not a palindrome");
        return false;
        
    }
}
