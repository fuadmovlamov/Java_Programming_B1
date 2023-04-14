package day15_string;
/*
   [SMS parts]
   Given a String in the following format:
   “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
   Separate these parts and print them separately: Sender: actualSender
   Number: actualNumber Message: actualMessage”
    */
public class SmsPart {
    public static void main(String[] args) {
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int sendSart = msg.indexOf("<")+1;
        int sendEnd =  msg.lastIndexOf(">");
        String name = msg.substring(sendSart, sendEnd);
        System.out.println(name);

        int numStart = msg.indexOf("[")+1;
        int numEnd = msg.indexOf("]");
        String number = msg.substring(numStart, numEnd);
        System.out.println(number);

        int msgStart = msg.indexOf("{")+1;
        int msgEnd = msg.indexOf("}");
        String message = msg.substring(msgStart, msgEnd);
        System.out.println(message);


    }

}
