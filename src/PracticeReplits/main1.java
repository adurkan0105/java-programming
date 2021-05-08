package PracticeReplits;

import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeOuter];
        int[] outer = new int[sizeInner];

        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        for (int i = 0; i < inner.length; i++) {

            for (int j = 0; j < outer.length; j++) {

                if (inner[i] == outer[j]) {
                    System.out.println("True");

                }


            }
        }}}