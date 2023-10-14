package day21_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {


    public static void main(String[]args) {


        String[] month = {"January", "February", "March", "April", "May", "Jul", "june", "August", "September", "October", "November", "December"};
        //                    0          1           2       3       4      5       6       7          8            9        10           11

        System.out.println(month.length);

        System.out.println(Arrays.toString(month));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  a number of month");
        int numOfMonth = input.nextInt();

        if (numOfMonth >=1 && numOfMonth <= 12){
            System.out.println(month[numOfMonth]);

        } else {
            System.out.println("invalid input");
        }

    }
}
