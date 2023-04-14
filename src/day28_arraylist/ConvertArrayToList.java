package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        ArrayList <Integer> nums;

        Integer [] arr = {1, 2, 3}; //The reason we made this with Integer datatype is that we will use array as part of ArrayList and ArrayList works only with object type.

        System.out.println(Arrays.toString(arr));

        Arrays.asList(arr);  // This method from Arrays class, take the array and makes it as ArrayList


        // Here we created an ArrayList with initial values directly.
        nums = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 8, 8, 34));
        System.out.println(nums);


        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);


    }
}
