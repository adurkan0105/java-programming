package day39_Wrapper_classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println(Integer.reverse(123));
        System.out.println("MIN INT: "+ Integer.MIN_VALUE);
        System.out.println("MAX INT: "+ Integer.MAX_VALUE);
        System.out.println(Double.max(234.4,23.9));
        System.out.println("MIN DOUBLE: "+ Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: "+ Double.MAX_VALUE);
        System.out.println(Double.compare(5,1)); //1 first larger than second
        System.out.println(Double.compare(5,5)); //0
        System.out.println(Double.compare(5,45));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter= 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");

        }
String word="JaVa is FuN";

    }
}
