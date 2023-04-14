package day22_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] str = {"a", "b", "c"};
        System.out.println(Arrays.toString(str));

        System.out.println(String.join("<>", str));
        System.out.println(String.join("-----", str));
        System.out.println(String.join("****", str));
        System.out.println(String.join(" ", str));
        System.out.println(String.join("", str));

        String result = String.join("+++", str); // arguments - whatever is in the parenthesis of the method
        System.out.println(result);






    }
}
