package day28_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        System.out.println(group);

        group.add("Tom");
        group.add("Jerry");
        group.add("Micky");
        group.add("Mouse");
        System.out.println(group);
        group.add("Vinni");
        System.out.println(group);

        // Get the total element count
        System.out.println(group.size());

        System.out.println("First cartoon character: " + group.get(0) );
        System.out.println("Last cartoon character: " + group.get(group.size()-1));


        for (int i = 0; i < group.size(); i++) {
            System.out.println("Cartoon character number " + (i+1) + ": " + group.get(i) );
        }


    }
}