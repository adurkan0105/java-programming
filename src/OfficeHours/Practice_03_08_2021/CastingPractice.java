package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
       //byte > short > int > long > float > double

        byte b=10;
        short s=b;
        byte b2= (byte)s;
        double d= 5.3;
     // not going to work   int i=d;
       int i = (short)d;
       int i2 = (int)d;
       float f = 3.54f;
       float f2=(float)3.54;
       float f3=5; // float= int > 5.0
        float f4 =5.5F;
        //compiler will read any decimal as double
        long l= 22313; // long= int
        long l2= 31231231222L;
        System.out.println("l = " + (double)l);
        System.out.println("l2 = " + (float)l2);

        double million =1000000;
        System.out.println("million = " + million);

    }
}
