package day21_arrays;

/*

    declare and assign an array

    500, 120, -80, 90, 250, - 10

    find the biggest number in the array

    find the smallest number in the array

    flow: go through each number in the array, compare that element with the biggest number and compare that element with the smallest number

 */
public class MinMax {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

//        int max = 0;
//        int min = 0;


        int max = nums[0];
        int min = nums[0];


        for (int i = 0; i < nums.length; i++) {

            int each = nums[i];

            if (each > max) {
                max = each;
            }

            if (each < min) {
                min = each;
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);


    }



}
