package day08_scanner_logical_operators;

public class LogicalOperator {

    public static void main(String[] args) {

        int num = 20;

        System.out.println(num > 5);    // true
        System.out.println(num < 10);    // false


        System.out.println(num > 5  && num > 10);  // true
        //                  true   &&  true


        System.out.println(num < 5  && num > 10);  // false
        //                   false  &&    true


        int i = 5;
        int y = 10;

        System.out.println(y > 9 && i++ > 2); // true
        //                  true
        System.out.println(i);


        i = 5;
        System.out.println(y < 9 && i++ > 2); // true
        //                  false
        System.out.println(i);

        int x = 20;
        int w = 30;
        System.out.println(x < 5 || w++ > 20);  // true
        //                  false    executed
        System.out.println(w); // 31


        w = 30;
        System.out.println(x > 5 || w++ > 20);  // true
        //                  true   not executed

        System.out.println(w);



        System.out.println(y < 9 & i++ > 2);
        System.out.println(x > 5 | w++ > 20);




        boolean isCorrect = false;
        System.out.println(isCorrect);

        System.out.println(false);


        System.out.println(!false);  //true
        System.out.println(!isCorrect); //true






    }



}
