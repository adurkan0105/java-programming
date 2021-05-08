package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list="cat, car, cat, red car, java, selenium";
 for(int i=0; i< list.length()-2; i++ ){
     String part=list.substring(i,i+3);
     System.out.println(list.substring(i, i+3));


     if(list.substring(i,i+3).equals("cat")||list.substring(i,i++).equals("car")){
         System.out.println("cat or car found ");
     }




 }
 for(int i =0; i<list.length()-2;i++){
    String part=list.substring(i,i+3);
            System.out.println("part= "+ part);
            if(part.equals("cat")||part.equals("car")){
                System.out.println("cat or car found ");
            }

        }
    }
}
