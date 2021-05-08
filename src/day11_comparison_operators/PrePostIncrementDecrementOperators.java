package day11_comparison_operators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1=1;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1);  //3

        int num2=5;
        num2--;
        --num2;
        System.out.println(num2);

        int num10=100;
        int num11=++num10;
        System.out.println(num10); // 101
        System.out.println(num10); //101

// post increment
        int num13=8;
        int num14=num13;
        num13++;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        //------------------------------------------------------
        int apples=5;
        int basket= ++apples;

        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
        int kiwi =15;
        int kiwiBaset=kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBaset = " + kiwiBaset);


        int cars= 5;
        System.out.println("cars = " + ++cars);
        int sedans= 10;
        System.out.println("sedans = " + sedans++); /// after printing 10
        System.out.println("sedans = " + sedans);
 int a=50;
 int b=22;
 int c= a++ + ++b; // 73  reads a then adds it the b
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
