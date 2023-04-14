package day21_arrays;
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output:
    Even: 2
    Odd: 3
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4,1,3,12,5};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
         }

        System.out.println("Even count: " + countEven);
        System.out.println("Odd count: " + countOdd);


        System.out.println("--------------------------");

        int countEven2 = 0;
        int countOdd2 = 0;

        for (int eachElement : nums) {

            if (eachElement % 2 == 0) {
                countEven2++;
            } else {
                countOdd2++;
            }
        }

        System.out.println("Even count: " + countEven2);
        System.out.println("Odd count: " + countOdd2);

    }



}
