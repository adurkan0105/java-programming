package day24_loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner pincode = new Scanner(System.in);
        int secretPincode = 1234;
        System.out.println("Please enter your pincode");
        int PinCode;
        do {
            System.out.println(
                    "Enter pin code");
            PinCode = pincode.nextInt();

        } while (PinCode != secretPincode);
        {
            System.out.println("Welcome to your account ");

        }
    }
}
