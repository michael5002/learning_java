public class challenge {
    public static void main(String[] args){
        double num1, num2, result;
        num1 = 20.00;
        num2 = 80.00;
        result = (num1 + num2) * 100.00;
        System.out.println(result);

        double remainder = result % 40.00;
        System.out.println(remainder);

        if(remainder== 0.00){
            System.out.println("true");
        }
        else{
            System.out.print("false");
        }

    }
}
