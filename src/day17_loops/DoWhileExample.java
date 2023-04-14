package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        do{
            System.out.println("This will print at least 1 time");
        } while (false);


//        while (false) {
//            System.out.println("This will print at least 1 time");
//        }




        int a = 0;
        do {
            System.out.println(a);
            a++;  // 1
        } while (a <= 10);

        System.out.println("---------");

        int a1 = 0;
        do {

            System.out.println(a1);   // 0
            a1= 10;                 // reassign the a1 to be 10

        } while (a1 != 10);   // ( 10 != 10) -- >false








    }



}
