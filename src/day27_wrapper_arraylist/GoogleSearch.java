package day27_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 1,700,000,000 results (0.43 seconds)";
        String []  strArr = result.split(" ");
        System.out.println(Arrays.toString(strArr));

        //1,700,000,000
        //(0.43

        String resultCount = strArr[1];
        String time = strArr[3];

        System.out.println(resultCount);
        System.out.println(time);


        resultCount = strArr[1].replace(",", "");
        time = strArr[3].substring(1);
        System.out.println(resultCount);
        System.out.println(time);


        // convert them to primitive data types
        long resultAsNum = Long.parseLong(resultCount);
        double timeAsNum = Double.parseDouble(time);

        if (resultAsNum > 0) {
            System.out.println("We are getting correct amount of result");
            System.out.println("We can add number to test " + (resultAsNum + 10));
        }

        if (timeAsNum > 10) {
            System.out.println("It took a lot of time to load the page");
        }

    }
}
