package day19_nested_loops;

/*
Biggest substring of matching characters
                    Given a String find the biggest substring of chars that match and print it.

                    Ex: aaabbbcccccddddee
                    Output: ccccc
 */

public class BiggestSubstring {
    public static void main(String[] args) {

        String word = "aaabbbcccccddddeeAAAAAAAA";  // aaa  bbb  ccccc dddd  ee
        String longest = "";
        String nonLongest = "";

        for (int i = 0; i < word.length()-1; i++) {

            nonLongest += word.charAt(i);

            if ( word.charAt(i) == word.charAt(i+1)) {
                continue;
            }

            if (longest.length() < nonLongest.length()) {
                longest = nonLongest;
            }
            nonLongest = "";
        }
        System.out.println(longest);

    }
}
