package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {
        // byte, short, int, long, float, double
        use (2);
        use (3.2);  // by default decimal numbers are double that is why it is calling the method with the parameter of double
        use (3.4f);
        use (3.4F);
        use (12l);


        use((double)3);

        short s = 3;
        use(s);


        use (4.5);
    }

    public static void use (float f) {
        System.out.println("calling float");
    }

    public static void use (double d) {
        System.out.println("calling double");
    }

    public static void use (long l) {
        System.out.println("calling long");
    }


}


