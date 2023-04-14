package day08_scanner_logical_operators;


import org.w3c.dom.ls.LSOutput;

public class OrOperator {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5);  // true || false --- >true
        System.out.println(apples  > 10 || oranges == 10);  // false || true ---> true



    }

}
