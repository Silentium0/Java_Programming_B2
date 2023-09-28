package day13_strring;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

/*
declare and assign 2 number variables
declare and assign a string variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other input  operator: "invalid operator"
 */

        Scanner input = new Scanner(System.in);

        System.out.print("enter number  - 1 ");
        int num1 = input.nextInt();
        System.out.print("enter number - 2 ");
        int num2 = input.nextInt();
        System.out.print("Pick  operator:\n\t+\n\t-\n\t*\n\t/\n\t% \n Select: ");
        String operator = input.next();

        boolean runOrNotRun = true;
        int result = 0;
        String message = "";

        switch (operator) {
            case "+": case "plus":
                result = num1 + num2;
                break;
            case "_":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
            default:
                message = "invalid input ";
                runOrNotRun = false;
                break;

        }
        if(runOrNotRun) {

            System.out.println("You entered numbers  which are " + num1 + " and " + num2 + " \nWith " + operator + " operator you selected the result is " + result);
        }else {
            System.out.println(message);

        }

    }


}
