package day12_switch_statements;

/*
Ask a user for their gender


        m, M --- > Print Male restroom
        f, F --- > Female restroom

 */

public class MaleOrFemale {
    public static void main(String[] args) {

        char letter = 'h';

        switch (letter) {

            case 'm':
            case 'M':
                System.out.println("Male restroom");
                break;

            case 'f':
            case 'F':
                System.out.println("Female restroom");
                break;

            default:
                System.out.println("Invalid letter");

        }
    }
}
