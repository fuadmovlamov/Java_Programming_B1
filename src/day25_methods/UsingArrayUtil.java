package day25_methods;

import my_util.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {


        int [] arr = new int [] {23, 34, 54, 65};

        System.out.println(ArrayUtil.minNumInArr(arr));
        System.out.println(ArrayUtil.minNumInArr(new int[]{16, 28, 3, 45}));

        System.out.println(ArrayUtil.minNumInArrWithSort(arr));
        System.out.println(ArrayUtil.minNumInArrWithSort(new int[]{16, 28, 3, 45}));


    }


}
