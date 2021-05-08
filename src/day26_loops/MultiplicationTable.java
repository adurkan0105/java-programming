package day26_loops;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        int num=5;
        if  (num<1 || num>10 ){
            System.out.println("Invalid entry ");
            return;
        }
        for(int i = 1; i <= 10; ++i){
            System.out.println(num+ "x" + i + " = "+ num*i);
        }
    }
}
