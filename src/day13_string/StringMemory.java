package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {

//        String nothing = "";  // we have nothing
//        String space =  " ";  // 1 space



        // 1st way to create String object
        String str1 = "Java";  // this is the way creating String by LITERALS
        String str2 = "Java";  //
        String str3 = "Java";
        String str4 = "Java";
        String str5 = "Java";


        System.out.println(str1 == str2);


        String str6 = "JavA";
        String str7 = "JavA";
        String str8 = "JavA";

        System.out.println(str6 == str8);

        String str9 = "JAvA";

        System.out.println(str8 == str9);


        System.out.println("-----------------------");


        // ==
        // 2nd way to create String object
        String str10 = new String ("Java");
        System.out.println(str10);


        System.out.println("Hello World");
        System.out.println("Hello World");

        //String concatinate =  "Hello World" + " 2";

        String word1 = "loop";
        String word2 = "loop";

        String word3 = new String ("loop");
        String word4 = new String ("loop");
        String word5 = new String ("Loop");

        System.out.println(word3 == word4);

        System.out.println(word3.equals(word4));  // this method comes from String class
        System.out.println(word3.equals(word5));

        String a = "Loop camp";  // a new object in String Pool
        String b = a;            // existing object in String Pool
        String d = a + " is great!"; // "Loop camp is great!"  new object in String Pool

        a = "Loop  CAMP";        // It is a brand NEW String object



    }




}
