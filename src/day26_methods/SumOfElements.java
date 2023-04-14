package day26_methods;

public class SumOfElements {
    // varargs --- >  variable arguments
    public static void main(String[] args) {
        int [] arr = {12, 34, 23, 12, 65};
        int [] arr2 =  new int[] { 34, 23, 456, 756};

//        We can NOT declare an array like this. It is only valid in the method paranthesis
//        int ... num = {12, 34, 23, 12, 65};


        System.out.println(   sumOfElem(arr)    );
        System.out.println(   sumOfElem(arr2)    );
        System.out.println(    sumOfElem(new int[] {12, 34, 56, 786, 78})     );

        System.out.println(   sumOfElem2(1, 2, 3, 4, 5)    ); // 15


        System.out.println(      method(23, 45, 45, 4 )     );
        System.out.println(      method("Hello", 45, 45, 4 )     );








    }





    // create a method which accepts an int array and returns the sum of the elements
    public static int sumOfElem (int [] arr) {  // {12, 34, 23, 12, 65}
        int sum = 0;

        for ( int each : arr) {
            sum += each;
        }
        return sum;
    }


    public static int sumOfElem2 (int ... arr) {  // {12, 34, 23, 12, 65}
        int sum = 0;

        for ( int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static int method (int num, int ... arr) {
        return 1;
    }

    public static int method (String str, int ... arr) {
        return 2;
    }





//    Varargs HAS TO BE at the end in the parenthesis
//    public static int method (String str, int ... arr, int num) {
//        return 1;
//    }




//      We can NOT return it like this. It is only valid in the method paranthesis
//    public static int ... arr method (int num, int ... arr) {
//        System.out.println("Testing varargs");
//    }



}
