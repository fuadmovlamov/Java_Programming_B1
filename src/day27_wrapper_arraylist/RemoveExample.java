package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Water");
        list.add("Banana");
        list.add("Apple");
        list.add("Grape");
        System.out.println(list);  // [Water, Banana, Apple, Grape]
                                    //   0       1      2       3
        System.out.println("I have total " + list.size() + " elements on my list");


        //list.remove(0);   // Returns the element if the boolean result is true. And it is true if the element is removed.
        System.out.println(list.remove(0));  // this will remove the element and if it is removed it also prints out the removed element.
        System.out.println(list);


        String removedElem = list.remove(list.size()-1);
        System.out.println(removedElem);
        System.out.println(list);

        //ystem.out.println(list.remove(10));  // It checks if the index is in the range, if FALSE, it throws this exception IndexOutOfBoundsException


        boolean isRemoved = list.remove("Banana");  // If that element exists in list, it will remove and return the boolean result
        System.out.println(isRemoved);
        System.out.println(list);


        boolean isRemoved2 = list.remove("Water");
        System.out.println(isRemoved2);
        System.out.println(list);




        /*
            remove(withIndex);
                    - It check if the index is in the Arraylist range, if true, it removes that element on that index and return the removed element.
                    - It check if the index is in the Arraylist range, if False, it throws the exception -- > IndexOutOfBoundsException
            removed (withElement)
                    - It checks:
                           -if the given element exists in the ArrayList, if true, it removes that element and return TRUE
                           -if the given element does NOT exist in the ArrayList, if false, it does NOT remove that element and return FALSE

         */

        list.add("Bottle");
        System.out.println(list);
        list.add(0, "Newspaper");
        System.out.println(list);



    }
}
