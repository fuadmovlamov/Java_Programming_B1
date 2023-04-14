package day25_methods;
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

     */

public class FixFormat {

    public static String fixFormat (String str) { // jAMES -- >  J.toUpperCase() | AMES.toLowerCase();
        return (str.charAt(0)+"").toUpperCase() + str.substring(1).toLowerCase();
    }




}
