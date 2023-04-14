package day21_arrays;

import java.util.Arrays;

/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
 */
public class ReverseArray {
    public static void main(String[] args) {
        int [] original = {1, 2, 3, 4, 5, 7, 8, 9}; //  has the same length - 8
        //                 0  1  2  3  4  5  6  7
        int [] reversed = new int[original.length]; //  has the same length - 8
        //                {0, 0, 0, 0, 0, 0, 0, 0}
        //                 0  1  2  3  4  5  6  7

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));

        System.out.println("-------------------------");
        for (int i = original.length-1; i >= 0; i--) {
            //                             i = 7
            //                 8       -    (i + 1)
            //                             i = 6
            //                 8       -    (i + 1)
            //                             i = 5
            //                 8       -    (i + 1)
            //                             i = 4
            //                 8       -    (i + 1)
            //                             i = 3
            //                 8       -    (i + 1)
            //                             i = 2
            //                 8       -    (i + 1)
            //                             i = 1
            //                 8       -    (i + 1)
            //                             i = 0
            //                 8       -    (i + 1)
            reversed [ reversed.length -   (i +1)    ] = original[i];
            //        [        0        ]
            //        [        1        ]
            //        [        2        ]

        }


        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));


    }

}
