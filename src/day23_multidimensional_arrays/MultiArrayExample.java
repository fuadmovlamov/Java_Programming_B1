package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        int [] n = {2, 4, 5, 6};   // 1D array
        int [] m = {10, 33, 55, 77};  // 1D array

        int [][] all = {n, m};
        /*
            n --- > 1D array -- index is 0
            m --- > 1D array  -- index is 1
         */

        System.out.println(all);
        System.out.println(n);

        System.out.println(Arrays.toString(all));  // printing 2D array
        System.out.println(Arrays.toString(n));    // printing 1D array

        System.out.println(Arrays.deepToString(all)); // Correct way to print 2D array
        System.out.println("First array: " + Arrays.toString(all[0]));  //Here printing first 1D array in the 2D array
        System.out.println("Second array: " + Arrays.toString(all[1])); //Here printing second 1D array in the 2D array


        System.out.println("---------------");
        int [][] twoD = {
                {2, 3, 6, 8},
                {23, 45, 12, 334},
                {23},
                {349, 234, 345, 324, 234, 12, 67}
        };

        System.out.println(twoD[0].length); // 4
        System.out.println(twoD[1].length); // 4
        System.out.println(twoD[2].length); // 1
        System.out.println(twoD[3].length); // 7
        System.out.println(twoD[4].length); // Runtime Exception - ArrayIndexOutOfBoundsException



    }
}
