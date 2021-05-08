package day15_logicalops_swithc_ternary;

import java.sql.SQLOutput;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age is not more than 5. print "Need to sit in child car seat.
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age= " + age);
        }
        boolean isSmokingAllowed = false;
        //if smoking is not allowed: print " Smoking is not allowed here. Exit. "
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit ");
        } else {
            System.out.println("This area is for smoking ");
        }
        boolean isAffordable = true;
        //if its NOT affordable then print " Item Not affordable"



        String carModel = "Tesla";
        if(!carModel.equals("Tesla")){
            System.out.println("Not interested, thank you ");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
    }
}
