package day23_multidimensional_arrays;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {

        int [] arr = {30, 20, 40, 50, 100};
        int [] arr2 = {180, 350, 27, 50, 70};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------");
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Min in arr: " + arr[0]);
        System.out.println("Max in arr: " + arr[arr.length-1]);

        System.out.println("Min in arr2: " + arr2[0]);
        System.out.println("Max in arr2: " + arr2[arr.length-1]);


        System.out.println("-------------------");
        String [] words = {"java", "sql", "api", "softskills"};
        System.out.println("Before sorting: " + Arrays.toString(words));

        Arrays.sort(words);
        System.out.println("After sorting: " + Arrays.toString(words));


        System.out.println("-------------------");
        String afterJoin = String.join("^^^", words);
        System.out.println("After join: " + afterJoin);

        System.out.println("-------------------");
        String sentence = "java, sql, api, softskills";
        String [] sentArr = sentence.split("sql"); //
        System.out.println(Arrays.toString(sentArr));

        System.out.println("-------------------");
        String sentenceTwo = "Hello Loopers";
        String upper = sentenceTwo.toUpperCase();
        char [] chars = sentenceTwo.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.print(("" + each).toUpperCase());
        }









    }
}
