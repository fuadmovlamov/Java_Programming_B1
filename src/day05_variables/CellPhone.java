package day05_variables;
public class CellPhone {

    /*
        create a class CellPhone

        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)
        Print all the variables
            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */


    public static void main(String[] args) {

        String brand = "apple";
        String model = "IPhone 10";
        String color = "black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';


        // I have an [IPhone 10] from [apple]
        System.out.println("I have an " + model + " from " +brand);

        // It came in the color [black] and it has [128] GB
        System.out.println("It came in the color " + color + " and it has " + storage + " GB");

        // For the sim type [A] with a camera [hasCamera] the total price was $[price]
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + price);


        System.out.println();

        String fullMessage = "I have an " + model + "from " + brand + "\nIt came in color" + color + " and it has " + storage + " GB"  +    "\nFor the sim type " + sim + " with a camera " + hasCamera + "the total price was $" + price;

        System.out.println(fullMessage);




    }

}
