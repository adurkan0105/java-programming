package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        int guessingNumber=0;
        Random randomNum = new Random();
        int secretNumber = randomNum.nextInt(101);
        do {
            System.out.println("Guess the secret number");
           // guessingNumber = java.nextInt();
            guessingNumber = randomNum.nextInt(101);
            if (guessingNumber > secretNumber) {
                System.out.println("wrong, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("wrong, your number is too low");
            }
        } while (secretNumber != guessingNumber);
        {
            System.out.println("You Guessed it right : "+ guessingNumber);
        }
    }
}
