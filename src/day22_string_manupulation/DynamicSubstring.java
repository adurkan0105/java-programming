package day22_string_manupulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result="result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex=result.indexOf(":");
        System.out.println(colonIndex);


        System.out.println(result.substring(colonIndex+1));


        System.out.println(result.substring(result.indexOf(":")));

        String today="i learned [java] today";
       int beginning =today.indexOf("[");
       int ending = today.indexOf("]");
        System.out.println(today.substring(beginning+1,ending));

        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));





    }
}
