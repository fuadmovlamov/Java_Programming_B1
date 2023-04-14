package day21_arrays;
/*
        Average Number from Array
        Given an int array calculate the average number -> Make it flexible so it will work with any array size
        Examples:
        [1,2,3] -> average: 2
        [10, 15, 5, 6] -> average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
*/
public class AverageNumber {
    public static void main(String[] args) {

        int [] arr1 = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int total = 0;

        for (int each: arr1) {
            total += each;
        }

                        //               90 / 9
        System.out.println("Average: " + (total/arr1.length));

        System.out.println("The total: "  + total +
                "\nElement amount: " + arr1.length +
                "\nAverage is: " + (total/arr1.length));

    }

}
