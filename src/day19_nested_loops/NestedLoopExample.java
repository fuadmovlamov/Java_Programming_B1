package day19_nested_loops;

public class NestedLoopExample {

    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {   //initialization [i-ni-shi-lia-zey-shin]
//            System.out.println("Hello Loop Academy");
//        }


        System.out.println("-------------------------------------");

        for (int i = 1; i <= 2; i++) {     // Outer Loop - 2

            System.out.println("This is the number **** " + i + " **** iteration");


            System.out.println("Hello world");  //  can you print this 3 times for each outer loop iteration
            System.out.println("Hello world");
            System.out.println("Hello world");
            
        }





//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");


        for (int i = 1; i <=3; i++) {
            System.out.println("hello world");
        }

        for (int i = 1; i <=3; i++) {
            System.out.println("hello world");
        }


        for (int j = 0; j < 2; j++) {
            for (int i = 1; i <=3; i++) {
                System.out.println("hello world");
            }
        }




    }


}
