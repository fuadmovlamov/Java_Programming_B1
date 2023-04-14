package day16_loops;

public class PrintNumbers {

    public static void main(String[] args) {

        int n = 2;


        System.out.println(n);


//        while (n <= 100){
//            System.out.println(n);
//            n++;
//        }

        System.out.println("----------------");

        // print even numbers from 2 to 100
        while (n <= 100) {
            System.out.println(n);
            n += 2;
        }


        // n = 100;
        System.out.println("----------------");

        n = 2 ;

        // print even numbers from 2 to 100
        while (n <= 100) {
            System.out.println(n);
            n += 2;
        }


        System.out.println("----------------");
        n=2;
        while (n <= 100) {

            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
