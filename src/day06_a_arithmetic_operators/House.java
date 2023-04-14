package day06_a_arithmetic_operators;

 /*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type,
        number of bedrooms,
        number of bathrooms,
        number of kitchens,
        is there a basement?,
        is there an attic,
        is there a pool,
        is the house for sale?,
        cost of the house,
        address,
        zipcode,
        is a park near by,
        Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

public class House {

    public static void main(String[] args) {

        String houseType = "Single House";
        int numberOfBedroom = 5;
        int numberOfBathroom = 5;
        int numberOfKitchen = 2;
        boolean isThereABasement = false;
        boolean isThereAttic = false;
        boolean isTherePool = true;
        boolean isItOnSale = false;
        double costOfHouse = 1_000_000.99;
        String address = "123 Central Ave";
        int zipCode = 12345;
        boolean hasPark = true;
        double schoolRating = 4.6;


        String houseInfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedroom + " bedroom, " + numberOfBathroom + " bathrooms, " + numberOfKitchen + " kitchens" + "\nIt also includes a basement: " + isThereABasement + ", has an attic: " + isThereAttic + ", has a pool: " + isTherePool + ", is on sale: " + isItOnSale + ", and has a park: " + hasPark + "\nThe schools in the area have a rating of " + schoolRating;


        System.out.println(houseInfo);


    }





}
