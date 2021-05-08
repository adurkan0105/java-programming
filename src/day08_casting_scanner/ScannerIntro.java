package day08_casting_scanner;
import java.util.Scanner;
//importing Scanner class from another class





public class ScannerIntro {
    public static void main(String[] args) {
        //type on top of class : import java.util.scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your name");
    String firstName = scan.next();
    System.out.println("nice to meet you," + firstName);







    }
}
