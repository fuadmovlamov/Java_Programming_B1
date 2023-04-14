package day19_nested_loops;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

//        String word = "applea"; // 5
//                    // 01234
//        String unique = "";
//
//
//        for (int i = 0; i < word.length(); i++) {   // do the loop going throuhg the length of the word   //apple
//
//            int count = 0;                                                                                 // count  = 0;
//            char letter = word.charAt(i);                                                                  // i = 0 --- > letter = a
//
//
//            if (!unique.contains("" + letter)) {
//
//                for (int j = 0; j < word.length(); j++) {
//
//                    char eachLetter = word.charAt(j);
//                                                                                        // true     false     false   false   false
//                    if (letter == eachLetter) {                                        //  a == a | a == p | a == p | a == l | a == e | a == a
//                        count++;
//                    }
//
//                } // end of INNER LOOP
//
//                System.out.println(letter + " - " + count);
//                unique += letter;
//            }
//        }


        System.out.println("----------------------");



        String word = "applea";
        String unique = "";


        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            char letter = word.charAt(i);

            if (unique.contains(""+ letter)) {
                continue;
            }

            for (int j = 0; j < word.length(); j++) {

                char each = word.charAt(j);

                if (letter == each) {
                    count++;
                }

            }

            System.out.println(letter + " - " + count);
            unique += letter;

        }

    }

}
/*
a - 1
p - 2
p - 2
l - 1
e - 1
 */