package day23_string_manipulation;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Saim] From Number< +1(222) 333-4444> Message: {Hello, lets code some Java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1, end));
        String sender = message.substring(start + 1, end);
        System.out.println("sender= " + sender);

        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">"));


        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("text= " + text);

        System.out.println("   \t\nFik  ret \t ".trim());
        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about homework ");
        } else {
            System.out.println("Someone else message ");
        }



    }
}
