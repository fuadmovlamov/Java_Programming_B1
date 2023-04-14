package day08_scanner_logical_operators;

public class Discount {

    /*
                declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions
     */
    public static void main(String[] args) {

        boolean isWeekend = true,
                isTeacher = false,
                isPoliceOfficer = false,
                isFireFighter = false;

        boolean getsDiscount;


        getsDiscount = isWeekend && (isTeacher || isPoliceOfficer || isFireFighter);
        //                              false  ||   false
        //                                      false            ||   false
        //                                                  false
        //                    true       &&        false
        //                              false






        System.out.println(getsDiscount);

        System.out.println();

        getsDiscount = isWeekend && isTeacher || isPoliceOfficer || isFireFighter;
        //                  true &&  false
        //                      false         ||    fasle
        //                                  false               ||   fasel
        //                                              false
        System.out.println(getsDiscount);

        System.out.println();


        int a = 5;
        System.out.println(false && a++ > 3);
        System.out.println(a);

        System.out.println(true && (a++ > 3));
        System.out.println(a);
    }

}
