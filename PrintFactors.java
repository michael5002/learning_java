public class PrintFactors {
    public static void main(String[] args) {
        printFactors(32);
        printFactors(10);
    }

    public static void printFactors(int num){
        if(num<1){
            System.out.println("Invalid Value");
        }
        
        for(int i=1; i<=num; i++){
            if(num%i == 0){// if i divides num with no remainder, then it's a factor of num and is printed out.
                
                System.out.println(i);
            }
        }
       
    }
}
