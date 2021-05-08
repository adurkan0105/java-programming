package day09_scanner_practice;


import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in); //i is a variable you can put anything
        System.out.println("############### F to C CONVERTER PROGRAM #########");
        System.out.println("Enter Fahrenheit value:  ");
        double fahrenheitValue = i.nextDouble();

        double celciousValue = (fahrenheitValue - 32) * 5 / 9;
        System.out.println(fahrenheitValue+ " F is in C : " + celciousValue);

    }
}
