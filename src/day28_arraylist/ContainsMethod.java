package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Micky");
        names.add("Mouse");
        System.out.println(names);

        // .contains(); -- > it will return boolean value
        System.out.println(names.contains("Jerry"));
        System.out.println(names.contains("jerry"));

        boolean isInList = names.contains("Mouse");
        System.out.println(isInList);


        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println(nums.contains(200));  // contains() method takes the parameter as an object NOT as index

    }
}
