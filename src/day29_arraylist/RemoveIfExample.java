package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList <Integer> original = new ArrayList<>(Arrays.asList(4, 5, 6, 72, 7, 234, 76, 78));
        System.out.println(original);
        ArrayList <Integer> list1 = new ArrayList<>(original);
        // remove the elements form list that is divisible by 2
        list1.removeIf(each -> each % 2 == 0);
        System.out.println(list1);


        ArrayList <Integer> list2 = new ArrayList<>(original);
        list2.removeIf( each -> each > 100);
        System.out.println(list2);

        ArrayList <String> words = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        words.removeIf( each ->  each.startsWith("M") || each.startsWith("F"));
        System.out.println(words);

    }

}
