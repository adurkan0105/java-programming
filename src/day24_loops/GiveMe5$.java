package day24_loops;


import java.util.*;

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        System.out.println("Enter a Dollar amount ");
        int DollarAmount = kk.nextInt();
        while (DollarAmount != 5) {
            System.out.println("Give me 5 dollars ");
            DollarAmount = kk.nextInt();
        }

        System.out.println("Thank you, you entered 5 Dollars ");
    }
}
