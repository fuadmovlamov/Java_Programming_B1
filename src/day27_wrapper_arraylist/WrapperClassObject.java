package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        // primitive data type
        int a = 5;

        // object data type
        //Integer a2 = new Integer(7);  // redundant == deprecated
        Integer a3 = 6;     // autoboxing: primitive -- > wrapper object

        int a4 = a3;        // unboxing:  wrapper object -- > primitive


        // whole number by default is -- > int
        // decimal number by default is -- > double


        byte b = 2;   // narrowing - implicit casting
        Byte b2 = 20; // auto boxing - > primitive to object


        System.out.println(a);
        System.out.println(a3);

    }






}
