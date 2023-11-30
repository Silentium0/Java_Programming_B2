package day39_b_exception.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {



        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number One: ");
            int num = input.nextInt();
            System.out.print("Enter number  Two: ");
            int num2 = input.nextInt();
            System.out.println("Division is equal: "+ num/num2);

        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Done");






    }
}
