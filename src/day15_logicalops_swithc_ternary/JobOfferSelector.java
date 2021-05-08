package day15_logicalops_swithc_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
            String location= "Honolulu";
            double salary=120_000.0;
            boolean isRremote = true;
            boolean benefits = true;
            
            if(location.equals("Honolulu") && salary>= 120_000.0 && isRremote && benefits){
            System.out.println("Sure, I will accept this offer ");
        } else {
            System.out.println("Lets consider another offer or negotiate ");
        }
    }
}
