package day20_nested_loops;

   /*
    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

     */


public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String uniqueChar = "";

        for (int i = 0; i < str.length(); i++) {                // AAABCCDEEF    // A
                                                                                 // A
            int count = 0;                                                       // A
                                                                                 // B
             if (uniqueChar.contains("" + str.charAt(i))){
                 continue;
             }

            for (int j = 0; j < str.length(); j++) {
                                                                                 //      "AAABCC    - //      "AAABCC       //      "AAABCCDEEF           //      "AAABCC
                if (str.charAt(i) == str.charAt(j)) {                            // A  == A            // A  == A           // A  == A                    // B  == A
                    count++;                                                     // A  == A            // A  == A           // A  == A                    // B  == A
                }                                                                // A  == A            // A  == A           // A  == A                    // B  == A
            }                                                                    // A  == B            // A  == B           // A  == B                    // B  == B
                                                                                 // A  == C            // A  == C           // A  == C                    // B  == C
                                                                                 // A  == C            // A  == C           // A  == C                    // B  == C
            if (count > 1) {
                System.out.print(str.charAt(i));
            }

            uniqueChar += str.charAt(i);                 // "" + A + A + A + B + C + C + D + E + E + F


        }







    }
}
