package day23_multidimensional_arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int [] a  = {1, 2, 3, 4};
        int [] b = a; // This is not a brand new array. b is referencing to a's array

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("----------------");
        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("----------------");
        int [] c = Arrays.copyOf(a, a.length);   //This is a completely new array
        System.out.println(Arrays.toString(c));

        System.out.println("----------------");
        c [0] = -300;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));


        System.out.println("----------------");
        int [] d = Arrays.copyOf(a, a.length + 2);  // length = 6
        System.out.println(Arrays.toString(d));
        d[d.length-1] = -900;
        System.out.println(Arrays.toString(d));




    }
}
