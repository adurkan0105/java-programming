package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the price : ");
        double price= scan.nextDouble();

        if(price>=25){
            System.out.println("Amazon free shipping is eligible. Your order total : $ "+price);


        }
        else {
            System.out.println("Amazon free shipping not included. Your order total : $ "+price );
        }





    }
}
