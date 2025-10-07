import java.util.Scanner;
public class addition {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int num1, num2, sum;

        System.out.print("Hello, What's your name? ");
        String name = input.nextLine();
        
        System.out.print("Enter first number " + name + ": ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.print("The sum is : " + sum + ", " + name);
    }

}
