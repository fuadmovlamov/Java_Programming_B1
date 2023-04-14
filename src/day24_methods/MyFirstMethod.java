package day24_methods;

public class MyFirstMethod {


    public static void sayHello() {
        System.out.println("Hello Loop Academy folks.");
    }



    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();

        System.out.println("Ruslan asked me to print \"Hello Loop Academy folks.\" 50 times ");
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Loop Academy folks.");
        }

        System.out.println("Shefeg asked me to print \"Hello Loop Academy folks.\" 50 times ");
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Loop Academy folks.");
        }


        System.out.println("-------------");
        System.out.println("Shakir asked me to print \"Hello Loop Academy folks.\" 50 times ");
        sayHello50();

        System.out.println("Nataliia asked me to print \"Hello Loop Academy folks.\" 50 times ");
        System.out.println("-------------");
        sayHello50();



    }

    // The custom method being after of before the main method() does NOT matter because it the main() method, it goes from top to bottom.
    public static void sayHello50() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Loop Academy folks.");
        }
    }


}
