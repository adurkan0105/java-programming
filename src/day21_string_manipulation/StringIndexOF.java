package day21_string_manipulation;

public class StringIndexOF {
    public static void main(String[] args) {
    String word= "github";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub"));
        System.out.println(word.indexOf("java"));//- 1 is it cannot find
        System.out.println(word.indexOf("t"));
    }
}
