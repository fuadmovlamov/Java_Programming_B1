package day15_string;

public class MoveFirstWord2 {
    public static void main(String[] args) {


        String str = "One Two";
        String firstPart = str.substring(0, str.indexOf(" ")); //One
        String secandPart = str.substring(str.indexOf(" ")+1);

        System.out.println(secandPart + " " + firstPart);







    }


}
