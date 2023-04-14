package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {

    public static void main(String[] args) {

        System.out.println(StringUtil.reverseStr("java"));
        //We can assing whatever the method returns to the variable with the matching data type
        String fixed = StringUtil.fixFormat("tOM") + " is friend with " + StringUtil.fixFormat("JERRY");
        System.out.println(fixed);


        System.out.println(StringUtil.camelCase("JAVA is GooD LAnGuage"));


        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z' ));
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p' ));



    }

}
