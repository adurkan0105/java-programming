package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){
        //byte>short>int>long
        //float>double
        //char
       // boolean  true false

        byte byteValue= 127;
        //byte to big -128 to 127 values byte
        //short -32768 to 32767
        short shortValue= 32000;
        int intValue=21253552;
        long longValue=5223452323342L;
        //We had to add L to long end
        float floatValue= 2345.55F;
        double doubleValue=2355432.4334; // 2355432.4334D also valid
        //***** CHARACTER TYPE
        char charValue='$'; //only one character
        char ch='B';
        char B='a';
        //Bloolean  true|false
        boolean booleanValue=false;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);

    }

}
