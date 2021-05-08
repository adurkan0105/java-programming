package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*

         */
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish wash";
        String[] arrWords = words.split(",");
        System.out.println(Arrays.toString(arrWords));

        for (String eachWord : arrWords) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }
        }

    }
}
