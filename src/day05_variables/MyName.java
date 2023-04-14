package day05_variables;

public class MyName {

    /*
    create a class MyName
    create a main method
    create multiple char variables, one for each letter of your name
    print your name
        print each letter in a different line
        print your name in the same line
     */


    public static void main(String[] args) {

        char letterOne = 'F';
        char letterTwo = 'e';
        char letterThree = 'y';
        char letterFour = 'r';
        char letterFive = 'u';
        char letterSix = 'z';


        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);
        System.out.println(letterSix);

        System.out.println();

        System.out.println(letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix );

        System.out.println("My name: " + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix );


        String name = "My name: " + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix;
        System.out.println(name);

    }

}
