package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){
     /*   balance -> 345.55
       price1 -> 20.88
       price2 -> 89.99
       price3 -> 15
       remainingBalance -> calculate
       your initial balance : $345.55
       Your remaining balance: $199.13
      */
        double price1=20.88;
        double price2=89.99;
        double price3=15;
        double iBalance= 345.55;
      double remainingBalance = 345.55-(price3+ price2+ price1);
       System.out.println("Your initial balance: $"+iBalance);
       System.out.println("Your remaining balance: $" + remainingBalance);
        int BalanceWithNoCents=(int)remainingBalance;
        System.out.println("Your remaining balance: $" + BalanceWithNoCents);










    }

}
