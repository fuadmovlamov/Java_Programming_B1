package day04_variables;

public class PrimitiveDatatypes {

    public static void main (String[]args) {

        byte age = 50;
        System.out.println(age);    // dynamic

        age = 40;
        System.out.println(age);


        byte age2 = 80;
        System.out.println("age2");
        System.out.println(age2);


        age2 = age;
        System.out.println(age2);

        age2=55;

        byte age3 = age2;
        System.out.println(age3);








        // byte number = 200;  // 200 is too high for byte type


        short year; // declare a variable caller  year and it's data type is short
        year = 2023; // assigning 2023 to a variable called year.


        // declare a variable called addressNumber and data type is int - assign  value of 244999944
        int addressNumber = 244999944;


        // long bugNumber = 13984730298412394 -- > this value is int by default it is too big and we need assign it long data type.
        long bugNumber = 13984730298412394L;  // We can add L at the end of the value








    }
}
