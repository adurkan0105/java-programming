package day13_condotional_Statements;


public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;


        double salesAmount = 2000.55;
        if (salesAmount <= 2000) {


            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("You qualify for bonus. ");


            bonus = 100.0;


        }
        System.out.println("Bonus amount is : $  " + bonus);
    }
}