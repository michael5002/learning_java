public class ternary {
    public static void main(String[] args){
        int ageofclient = 20;
        String eligible = (ageofclient >= 18) ? "of age" : "still a kid";
        System.out.println("The client is " + eligible);
     }
}
