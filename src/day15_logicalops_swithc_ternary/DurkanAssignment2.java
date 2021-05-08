package durkanassignment2;

/**
 *
 * Ali Durkan
 * Info 1521
 * Assignment 2
 */
import java.util.Scanner;
public class DurkanAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing the programs aim
        System.out.println("NCapitalize capitalize firts letters to upper case.");
        Scanner sc = new Scanner(System.in); // Scanner
        String sentence; // variable
        //getting input
        System.out.println("Enter the text you want to capitalize it:  ");
        sentence= sc.nextLine();
        printCapitalized(sentence);
    }

    static void printCapitalized( String str ) {
        // this portion of program is going to convert every word's first letter to uppercase

        char ch;       // One of the characters on the string
        char prevCh;   // Character comes before ch in the string
        int i;         // Position in str, from 0 to str.length()-1.
        prevCh = '.';  // loop for non word character
        for ( i = 0;  i < str.length();  i++ ) {
            ch = str.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;  // prevCh for next iteration is ch.
        }
        System.out.println();

    }
}
