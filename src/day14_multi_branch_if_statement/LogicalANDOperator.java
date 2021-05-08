package day14_multi_branch_if_statement;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true&& false);
        System.out.println(false&& false);
        System.out.println(false && true);
        System.out.println(10>5 && 1==1);
        System.out.println(99<100 && 22> 25);
        System.out.println(3>2 && 5>2);

   int apples = 10,  oranges= 5 ;
   if(apples > 6 && oranges > 2){
        System.out.println("I have enough apples and oranges ");
    }else System.out.println("I don't have enough apples and oranges ");
    }
}
