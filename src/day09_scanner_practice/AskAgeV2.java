package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args)
    {
        //Scanner scan= new Scanner(System.in);
        // Scanner is non-primitive, object type, class type, Scanner is class name,
        Scanner scan= new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt(); // or just scan.nextInt();
        System.out.println("That's a great age");


    }
}
