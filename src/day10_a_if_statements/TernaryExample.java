package day10_a_if_statements;

public class TernaryExample {

    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;


        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }

        System.out.println(evenOrOdd);
        System.out.println("----------------------------------");

        a = 9;

        String evenOrOdd2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd2);

        int number = (5 > 4) ? 5 : 4;


    }

}
