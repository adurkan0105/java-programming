package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        // String month=scan.nextLine(); // fix the bug. Workaround // whenever you use nextLine after nextInt, nextDouble etc. add additional scan.nextLine();
        String month = scan.nextLine();
        scan.nextLine();
        String monnth = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

// must say next not next line


    }

}