package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {

        ArrayList <String> jobs = new ArrayList<>();


        //jobs.addAll(Arrays.asList("SDET", "Quality Engineer", "Automation Engineer", "Quality Assurance"));
        jobs.addAll(Arrays.asList("SDET", "QE", "AE", "QA", "BA", "PO", "SM", "PM"));
        System.out.println("Original: " +jobs);

        // removeAll() - this method removed all the given values form the list if they match.
        ArrayList <String> job1 = new ArrayList<>(jobs);  // Created new Arraylist object by copying the values from jobs ArrayList
        job1.removeAll(Arrays.asList("BA","PO", "SM"));
        System.out.println(job1);

        //retainAll() - This method will keep all the given values and remove rest.
        ArrayList <String> job2 = new ArrayList<>(jobs);
        job2.retainAll(Arrays.asList("SDET", "QA", "AE", "Qe"));  // It retains the exact matches.
        System.out.println(job2);


        // containsAll() - this method will check if ArrayList contains all given elements and will return boolean value
        ArrayList <String> job3 = new ArrayList<>(jobs);
        boolean result1 = job3.containsAll(Arrays.asList("QA", "BA", "PO"));
        boolean result2 = job3.containsAll(Arrays.asList("QA", "BA", "POO"));
        System.out.println(result1);
        System.out.println(result2);



    }

}

