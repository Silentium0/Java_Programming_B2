package day10_if_statements;

public class OverTime {
    /*

           create a double variable for your hourly rate
           create a double variable for the number of hours worked

           calculate your net pay, with consideration of overtime pay

               if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                   (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
        */
    public static void main(String[] args) {
        double hourlyRate = 60.0;
        double numHours = 40;
        double NetPay;
        double overTimeHours;
        String message;



        /*
        if number > 40 {
           overtime = numberHours - 40;
                   NetPay = (hourlyRate * 40) + (overTimeHours * hourlyRate * 1.5)
                   message = You are hard worker


            }else{
               NetPay = (hourlyRate *  numHour )
               message = You are hard worker

            }
            system.out.println("message")

         */


        if (numHours > 40) {
            overTimeHours = numHours - 40;
            NetPay = (hourlyRate * 40) + (overTimeHours * hourlyRate * 1.5);
            message = "You are hard worker" + numHours + "";


        }













    }
}