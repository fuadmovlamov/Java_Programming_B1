package day17_loops;

public class CountHi {
    public static void main(String[] args) {

        String sen = "abaaahiaaaahiaaaahiaaaahi";
        //            012345678........
        int countOfHi = 0;

//        //             h == h               i  == i
//        if (sen.charAt(5)=='h' && sen.charAt(5+1)=='i'){
//
//        }


        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == 'h' && sen.charAt(i + 1) == 'i') {
                countOfHi++;
            }


        }
        System.out.println("This is amount of hi you have: " + countOfHi);


    }


}
