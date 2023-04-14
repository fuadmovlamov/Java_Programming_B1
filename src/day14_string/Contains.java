package day14_string;

public class Contains {
    public static void main(String[] args) {

        String sentence = "Judo is more than sport";

        System.out.println(sentence.contains("is more"));  //true

        System.out.println(sentence.contains("morethan"));  //false

        System.out.println(sentence. contains("is than"));  //false


        System.out.println(sentence.contains("is") && sentence.contains("than"));  // true
        System.out.println(sentence.contains("is") || sentence.contains("than"));  // true
        System.out.println(sentence.contains("are") || sentence.contains("than"));  // true
        System.out.println(sentence.contains("is") && sentence.contains("the"));  // false




    }

}
