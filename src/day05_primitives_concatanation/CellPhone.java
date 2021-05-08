package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        //variable brand , model, color ,price, storage, has camera,
    String brand="Apple";
    String model= "12 Xmax pro";
    String color="Silver";
    double price= 699.00;
    short storage=256;
    boolean hasCamera= true;


//Sting is a non-primitive, object type
//"hello" => String value, it is letters, and with double quote.

System.out.print("Phone type:\t");
System.out.println(brand);
System.out.println("Brand is "+ brand);
System.out.println();
System.out.println(model);
System.out.println("Model is "+model);
System.out.println(color);
System.out.println("Color is : "+ color);
System.out.println(price);
System.out.println("Price is :"+ price );

System.out.println(storage);
System.out.println("Storage is :" + storage );
System.out.println(hasCamera);
System.out.println("Does it have camera : "+ hasCamera);


String city="BAKU";
System.out.println("City is " + city);

//we can use +  / concetanation / concatenate, Strings with everything else.



    }
}
