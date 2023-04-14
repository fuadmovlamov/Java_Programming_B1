package day22_arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] bankAccOne = {"Tom Jerry", "Checking", "1000234567", "100,000.00"};
        System.out.println("Number of the elements in the array: " + bankAccOne.length);  // 4
        System.out.println("My entire array: " + Arrays.toString(bankAccOne));  // [......]
        System.out.println("Name: " + bankAccOne[0]);
        System.out.println("Account type: " + bankAccOne[1]);
        System.out.println("Account no#: " + bankAccOne[2]);
        System.out.println("Balance: $" + bankAccOne[3]);


        System.out.println("------------------------------------");
        String [] bankAccTwo = new String[4];
        System.out.println("Array with default values: " + Arrays.toString(bankAccTwo));
        bankAccTwo [0] = "Micky Mouse";
        bankAccTwo [1] = "Saving";
        bankAccTwo [2] = "12324435345";
        bankAccTwo [3] = "1,232,432.00";
        //bankAccTwo [4] = "Test";   // RunTimeException ---- > ArrayIndexOutOfBoundsException
        //bankAccTwo [4] = 4;   // CompileTimeException
        System.out.println("My entire array 2: " + Arrays.toString(bankAccTwo));

        System.out.println("------------------------------------");
        String [] bankAccThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        bankAccThree [0] = input.nextLine();

        System.out.print("Account type: ");
        bankAccThree [1] = input.next();

        System.out.print("Account no#: " );
        bankAccThree [2] = input.next();

        System.out.print("Balance: $");
        bankAccThree [3] = input.next();
        System.out.println("My entire array 3: " + Arrays.toString(bankAccThree));


        // TODO: Check why it did not print.
        System.out.println("------------------------------------");
        String [] questions = {"Name: ", "Account type: ", "Account no#: ", "Balance: $"}; //  4
                            //    0           1                 2                3
        String [] bankAccFour = new String[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            bankAccFour[i] = input.nextLine();
        }

        System.out.println("My entire array 4: " + Arrays.toString(bankAccFour));


    }

}

