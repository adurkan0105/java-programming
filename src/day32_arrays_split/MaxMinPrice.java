package day32_arrays_split;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {

    String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
    double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
    int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("---1) find and print details most expensive item --");
double maxPrice=prices[0];
int indexOfMaxPrice=0;
for(int i = 0; i< prices.length; i++){
    if(prices[i]>maxPrice){
        maxPrice=prices[i];

    }
    System.out.println("maxPrice = "+ maxPrice);
}

//1) find and print details of most expensive item

//2) find and print details of least expensive item

//    PSEUDOCODE:
 //   Declare:
   // double maxPrice = price of first item;
   // int indexOfMaxPrice = index of first item - 0;

 //   LOOP STARTS FOR prices Array:
  //  read price[i] from array
   //         if price[i] is more than maxPrice
 //   change maxPrice to price[i]
  //  set indexOfMaxPrice to i
//
//    END FOR LOOP



}}

