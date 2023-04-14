package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

//
//        System.out.println(1 + " * " + 0 + " = " +  (1*0));
//        System.out.println(1 + " * " + 1 + " = " +  (1*1));
//        System.out.println(1 + " * " + 2 + " = " +  (1*2));
//        System.out.println(1 + " * " + 3 + " = " +  (1*3));
//        System.out.println(1 + " * " + 4 + " = " +  (1*4));
//        System.out.println(1 + " * " + 5 + " = " +  (1*5));
//        System.out.println(1 + " * " + 6 + " = " +  (1*6));
//        // ...... up to 10
//        System.out.println("");
//
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(1 + " * " + i + " = " +  (1*i));
//        }
//
//        System.out.println();
        for (int j = 1; j <= 10; j++) {

            for (int i = 0; i <= 10; i++) {
                System.out.println(j + " * " + i + " = " +  (j*i));
            }

            System.out.println();
        }

    }

}

