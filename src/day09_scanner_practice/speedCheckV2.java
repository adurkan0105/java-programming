package day09_scanner_practice;
import java.util.Scanner;

public class speedCheckV2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter current speed:");
        int currentSpeeed= scan.nextInt();
        int speedLimit=55;
        int overTheSpeedLimit=currentSpeeed-speedLimit;





        System.out.println("You are driving " + overTheSpeedLimit+ " mph over the speed limit. Slow down ");








    }
}
