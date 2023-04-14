package day24_methods;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters2D {
    public static void main(String [] args) {


        String [][] info = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        // info[0].length --- > 3
        // info[1].length --- > 4
        // info[2].length --- > 2
        // info.length ----- > 3


        for ( String [] eachArr : info) {

            for ( String eachWord  : eachArr) {

                System.out.print(eachWord.substring(eachWord.length()-1));
                //System.out.println(eachWord.charAt(eachWord.length()-1));   // This is the other way to access the last character of each word
            }
            System.out.println();
        }


    }
}


