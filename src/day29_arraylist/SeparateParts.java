package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//ABCD123$%#@&456EFG!
public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split("")) );
        System.out.println(list);

        ArrayList <String> numbers = new ArrayList<>(list);
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println(numbers);


        ArrayList <String> specials = new ArrayList<>(list);
        specials.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"));
        System.out.println(specials);


        ArrayList <String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        System.out.println(letters);
        letters.removeAll(specials);
        System.out.println(letters);

    }

}
