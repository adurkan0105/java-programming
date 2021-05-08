package day18_condition_practice_string_intro;

import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= scan.nextInt();

        if(number>0) {
            System.out.println("Number is positive " + number);
        }else if (number<0){
            System.out.println("It's negative number ");
        }else {
            System.out.println("Number is zero");

        }


    }
}
