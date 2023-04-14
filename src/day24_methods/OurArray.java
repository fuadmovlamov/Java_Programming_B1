package day24_methods;
/*

      all will accept array argument

      create a method that will print the first element
      create a method that will print the last element
      create a method that will print the element/s
      length matters -> even there is middle, for odd there is one middle

   */
public class OurArray {

    public static void main(String[] args) {
        int [] nums = {12, 43, 4656, 567, 345, 23, 567, 342, 3453};  // 9

        int [] num2 = new int[] {23, 45, 54, 65, 56};

        firstElemInArr(nums);
        lastElemInArr(nums);
        printEachElemInArr(nums);
        System.out.println();
        findMiddle(nums);


        printEachElemInArr(num2);
        System.out.println();
        printEachElemInArr(new int[] {5645, 5467, 67, 78, });
        //printEachElemInArr({234, 234, 234, 234, 234});  // We can not do this way for NOW
    }

    public static void firstElemInArr (int [] nums) {
        System.out.println("First element: " + nums[0]);
    }

    public static void lastElemInArr (int [] nums) {
        System.out.println("Last element: " + nums[nums.length-1]);
    }

    public static void printEachElemInArr (int [] userArr) {
        for (int each :userArr) {
            System.out.print(each + " ");
        }
    }

    public static void findMiddle (int [] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("My middles are: " + nums[nums.length/2 - 1] + " and " + nums[nums.length/2]);
        } else {
            System.out.println("My middle is: " + nums[nums.length/2]);
        }
    }

}
