package day12_conditional_statements;

import java.util.Scanner;

public class da12_conditional_statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentSpeed= 45;
        int speedLimit=55;


        System.out.println(currentSpeed> speedLimit); //false
        System.out.println(speedLimit<currentSpeed); // false
        System.out.println(speedLimit==currentSpeed); //false

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit+ " mph");
        isSpeeding= currentSpeed>speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit+ " mph");

        double accountBalance=250.25;
        double itemPrice =100;
        System.out.println("Can I afford ? - " + (accountBalance>=itemPrice));

        boolean canAfford = (accountBalance >= itemPrice);
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -=itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? - " + isBroke);









    }
}
