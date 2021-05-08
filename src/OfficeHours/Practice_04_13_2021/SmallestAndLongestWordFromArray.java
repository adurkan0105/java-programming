package OfficeHours.Practice_04_13_2021;

import java.util.*;

public class SmallestAndLongestWordFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter: ");
        String[] words = new String[input.nextInt()];
        input.nextLine();
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i + 1));
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));
        String smallest, largest;
        String[] smallAndLarge = {words[0], words[0]};

        for (String eachWord : words) {
            if (eachWord.length() < smallAndLarge[0].length()) {
                smallAndLarge[0] = eachWord;
            }
            if (eachWord.length() > smallAndLarge[1].length()) {
                smallAndLarge[1] = eachWord;
            }
        }
        System.out.println("Smallest element: " + smallAndLarge[0]);
        System.out.println("Largest element: " + smallAndLarge[1]);
        System.out.println(Arrays.toString(smallAndLarge));
    }
}
