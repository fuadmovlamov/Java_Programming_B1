package my_util;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method will accept an int array
     * And will return the minium number
     *
     */
    public static int minNumInArr (int [] arr) {

        int min = arr [0];
        for (int each : arr ) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    /**
     * This method will accept an int array
     * And will return the minium number
     *
     */
    public static int minNumInArrWithSort (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    /**
     * This method will accept an int array and the num
     * It will return if the number exists in the array
     */
    public static boolean containArr (int [] arr, int num) {

        for (int each : arr) {
            if(each == num) {

                return true;
            }
        }
        return false;
    }


    /**
     *
     * This method accepts int array and a number
     * And retrns the index of the number in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * This method accepts String array and a String
     * And retrns the index of the String in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (String [] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }


    /**
     *
     * This method accepts int array and the int num
     * And returns the a new array with the num added at the end
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }

    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;

    }


    /**
     *
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */

    public static int [] addElemBeginning (int num, int ... arr) {

        int [] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = num;

        return newArr;
    }


    /**
     *
     * This method accepts String word and the String array
     * And returns the new array with the word added at the beginning
     */

    public static String [] addElemBeginning (String word, String ... arr) {

        String [] newArr = new String [arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = word;

        return newArr;
    }

}
