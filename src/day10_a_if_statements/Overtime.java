package day10_a_if_statements;

/*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked

        calculate your net pay, with consideration of overtime pay

            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 100.0;
        double workedHours = 30;   // workedHours = 45;
        double netPay;



        double extraHours = workedHours - 40;
        netPay = 0;


        if (workedHours > 40) {

            // I have worked more than 40 hours
            //netPay = netPay +  extraHours * (hourlyRate * 1.5);
            netPay +=  extraHours * (hourlyRate * 1.5);
            System.out.println("You worked " + workedHours + " hours at the rate of " + hourlyRate + ", but with " + extraHours + " extra hours overtime. So, you get in total pay of $" + netPay );

        } else {
            netPay = workedHours * hourlyRate;
            System.out.println("You worked " + workedHours + " hours at the rate of " + hourlyRate + "So, you get in total pay of $" + netPay );

        }












    }

}
