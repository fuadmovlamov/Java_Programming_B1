package day06_b_unary_operators;

public class IncrementExample3 {

    public static void main(String[] args) {

        int i = 5;
        int z = i++;  // z = 5;     i = i + 1; -- > i = 6;
                                //      i + 1;
        System.out.println(i);
        System.out.println(z);


        int a = 10;
        int b = a + 1;

        System.out.println(a);  // a = 10
        System.out.println(b);  // 11

        int c = ++a;   // c = (a = a+1) / a =11
        //int c = (a = a + 1)

        int d = a++;
        //ind d = a; a=a+1  (a=12)  d = 11
        System.out.println(d);
        System.out.println(a);


    }
}
