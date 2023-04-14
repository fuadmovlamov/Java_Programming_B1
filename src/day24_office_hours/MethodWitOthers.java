package day24_office_hours;

/*
    Create a method that accepts a number and returns the day of the week
 */
public class MethodWitOthers {

    public static String dayOfWeek(int num) {  // 2

        if (num > 7 || num < 1) {
            return "Number is not in the range.";
        }

        String[] words = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        //                   0      1      2      3       4      5      6
        return words[num - 1];  // I am converting a number to index by minusing 1
    }


    public static String dayOfWeek2(int num) {

        String day = "";

        switch (num) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tue";
                break;
            case 3:
                day = "Wed";
                break;
            case 4:
                day = "Thu";
                break;
            case 5:
                day = "Fri";
                break;
            case 6:
                day = "Sat";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                day = "Num is not in the range";
        }

        return day;
    }


    public static String dayOfWeek3 (int num) {

        switch (num) {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
            default:
                return "Num is not in the range";
        }


    }

    public static void main(String[] args) {
        System.out.println(dayOfWeek(8));
        System.out.println(dayOfWeek2(3));
        System.out.println(dayOfWeek3(6));


    }


}
