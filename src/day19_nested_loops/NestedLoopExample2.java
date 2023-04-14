package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {                           // 1                // 2                    // 3



            if (i == 1) {                                       // 1 == 1           // 2 == 1               // 3 == 1
                System.out.println("Color is Red");             // Color is Red
            }

            if (i == 2) {                                       // 1 == 2           // 2 == 2               // 3 == 2
                System.out.println("Color is Black");                               // Color is Black
            }

            if (i == 3) {                                       // 1 == 3           // 2 == 3               // 3 == 3
                System.out.println("Color is Blue");                                                        // Color is Blue
            }

        }


        System.out.println("--------------------------");


        for (int i = 0; i < 5; i++) {
            System.out.println("A" + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("B" + j);
            }

            System.out.println();

        }


        
/*
            A0
                B0
                B1
                B2
                B3
                B4
            A1
                B0
                B1
                B2
                B3
                B4
            A2
            A3
            A4
 */



        System.out.println("--------------------------");



        String str = "java";
                //    0123
        for (int i = 0; i < str.length(); i++) {            //  0       1                   2                            3                             4 < 4

            for (int j = 0; j < i; j++) {                   // 0 < 0    0 < 1  | 1 < 1      0 < 2   | 1 < 2  | 2 < 2     0 < 3 | 1 < 3 | 2 < 3 | 3 < 3
                System.out.println(str.charAt(i));          // a                            v        v                   a       a       a
            }

            System.out.println();

        }


    }



}
