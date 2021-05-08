package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) {
        int seconds= 0;
        while(seconds<=117){
            System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");

            seconds++;
            System.out.println("watching Youtube video: "+ seconds);
        }


        System.out.println("Finished watching the \uD83D\uDC08 video");
        System.out.println("Lets start another one!");
    }
}
