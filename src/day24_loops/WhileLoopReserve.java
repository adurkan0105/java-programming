package day24_loops;

public class WhileLoopReserve {
    public static void main(String[] args) {
        byte count = 10;
        while (count >= 0) {
            System.out.println("count \\uD83D\\uDC08  = " + count);
            count--;

        }
        int unreadSms = 10;
        System.out.println("I have total " + unreadSms + " uD83D\uDC8C unread sms ");
        while (unreadSms > 0) {
            System.out.println("Reading SMS : " + unreadSms);
            --unreadSms;
        }
        System.out.println("Finished the count");
    }
}
