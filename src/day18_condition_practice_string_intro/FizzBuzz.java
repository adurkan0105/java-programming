package day18_condition_practice_string_intro;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number=scan.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("It is FizzBuzz ");
        }
         else if(number%3==0){
            System.out.println("It is Fizz ");
        }
        else if(number%5==0){
            System.out.println("It is Buzz ");
        }else {
            System.out.println(number);
        }

    }
}
