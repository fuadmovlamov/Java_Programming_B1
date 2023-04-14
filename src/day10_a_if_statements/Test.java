package day10_a_if_statements;

public class Test {
    public static void main(String[] args) {

        int number = 10;

        if(--number > 10) {
            System.out.println("Hello Loop Academy " + number);
        } else if (number == 9) {
            System.out.println("Hello World " + number);
        }
    }
}
