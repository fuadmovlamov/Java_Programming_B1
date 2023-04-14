package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        System.out.println(group);
        group.add("Gunel");
        System.out.println(group);
        group.add(0, "Nataliia");
        System.out.println(group); // Nataliia Gunel

        // method overloading is happening.
        group.add("Vlad");
        group.add(0, "Khosgadam");

    }

}
