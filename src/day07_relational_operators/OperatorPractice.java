package day07_relational_operators;

public class OperatorPractice {

    public static void main(String[] args) {


        int i = 5;
        //      | 6  | 5   | 6   | 5
        int y = -i++ + --i + i++ / i--;
        //  y = -5   +   5 + 5   / 6
        //  y = -5   +   5 + 5   / 6
        //  y = -5   +   5 + 0
        //  y = -5   +   5
        //  y = 0

        //be back 8:17


        // pre
        // post

        System.out.println(i);
        System.out.println(y);




        //                   5%6

        //System.out.println(5%6);


        // int a = 5/5;  4/5 = 0
        // int b = 13%8;

        // 13 / 8 = 1 (8/8) + 5/8

    }


}
