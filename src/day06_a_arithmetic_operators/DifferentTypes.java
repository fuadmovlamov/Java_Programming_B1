package day06_a_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args) {

        // two int types
        System.out.println(10 - 5);  // 5

        // two int types
        System.out.println(5 * 10);  // 50

        // double / int -- > double
        System.out.println( 10.0 / 5);  // 2.0

        // int / double -> double
        System.out.println(10 / 5.0);  //2.0


        System.out.println(10.0 / 5.0);
        System.out.println((int)(10.0 / 5.0));  // (int)(2.0) -- > 2

        System.out.println((double)5  *  2);  //10.0
                           // 5.0 * 2 -- > 10.0

        System.out.println((double)(5  *  2));  //10.0
                            // (double)(10) -- > 10.0


        byte b1 = 5;
        short s1 = 6;

        System.out.println(b1 * s1); // 30 - int
        System.out.println(b1 + s1); // 11 - int

        // -5, +4 (4)




    }


}
