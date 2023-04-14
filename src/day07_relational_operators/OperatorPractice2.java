package day07_relational_operators;

public class OperatorPractice2 {

    /*
    int a = 1;
    int b = -a-- + a++ / -a-- * --a;
    what is a?
    what is b?
     */

    public static void main(String[] args) {


        int a = 1;  // 0  |  1    | 0   | -1
        int b =       -a-- + a++ / -a-- * --a;
        //            -1   + 0   / -1   *  -1
        //            -1   +     0     *   -1
        //            -1   +     0
        //            -1

        System.out.println(a);
        System.out.println(b);


        System.out.println(5);
        System.out.println(-5);
        System.out.println(4/-1);



        //int i = 0;   i++;   i--;





    }

}
