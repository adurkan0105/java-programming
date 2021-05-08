package OfficeHours.Practice_03_22_2021;

import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=input.nextInt();
        //next() vs NextLine()
        //next() read a string value from the console it only reads a single word till the space
        //nextLine()-> read a String value from the console it will read multiple words. Also eccepts the enter input
        System.out.println("Enter your name ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println(name);
        System.out.println(number);

    }
}
