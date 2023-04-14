package day21_arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] original = {0, 0, 5, 0, 1, 0};
        int [] changed = new int[original.length];
        int index = 0;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed));


        System.out.println("---------------------");
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {

                changed[index] = original[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed));




    }
}



