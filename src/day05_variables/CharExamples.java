package day05_variables;

public class CharExamples {

    public static void main(String[] args) {

        // assign characters to char type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';


//        int number = 9;
//        System.out.println(numberOne);
//        System.out.println(number);


        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);


        System.out.println();
        System.out.println(letterOne + letterTwo + "   <---  STRING --->   " + letterOne + letterTwo);
        System.out.println();
        System.out.println("   <---  STRING --->   " + letterOne + letterTwo + "   <---  STRING --->   " + letterOne + letterTwo);


        char letterThree = 65;
        System.out.println(letterThree);

        //char letterFour = '65';  -->  this is invalid because there are two characters.

    }


}
