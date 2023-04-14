package day29_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("energy drink");
        drinks.add("hot chocolate");
        System.out.println(drinks);

        ArrayList <String> drinks2 = drinks;
        // how many ArrayList object I have created so far?  -- 1

        ArrayList <String> drinks3 = new ArrayList<>(drinks);
        // how many ArrayList object I have created so far?  -- 2


        String [] drinkList = {"Juice", "Milk", "Cappuccino", "Iced coffee"};
        ArrayList <String> drinks4 = new ArrayList<>(Arrays.asList(drinkList));
        System.out.println(drinks4);

        ArrayList <String> drinks5 = new ArrayList<>(Arrays.asList("Juice2", "Milk2", "Cappuccino2", "Iced coffee2"));
        System.out.println(drinks5);


        // new method .addAll();
        ArrayList <String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList("Juice3", "Milk3", "Cappuccino3", "Iced coffee3"));
        System.out.println(drinks6);

        drinks6.addAll(0, Arrays.asList("drink1", "drink2"));
        System.out.println(drinks6);


        drinks6.addAll (Arrays.asList("drink3", "drink4"));
        System.out.println(drinks6);

    }
}
