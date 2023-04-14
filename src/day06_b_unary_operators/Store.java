package day06_b_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTv = 100;


        System.out.println("I have a total of " + numberOfTv + " TVs");
        System.out.println("Person comes into the store and they bout one tv");
        //numberOfTv = numberOfTv - 1;
        System.out.println("Number of TV left in the store: " + --numberOfTv);

        System.out.println("Another person comes into store and puts the TV into his cart");
        System.out.println("Available TV in store: " + numberOfTv--);
        System.out.println("The same person who had the TV in his cart bought the TV");
        System.out.println("Now we have TV in total " + numberOfTv);



// MAC --- > control + V

        int R = 20;
        int W = -R--;
        System.out.println(W);

        R= 20;
        int W2 = - --R;
        System.out.println(W2);



        int t = 100;
        int p = -++t * -t-- / t++ + --t;

        System.out.println(t);
        System.out.println("p = " + p);
    }

}
