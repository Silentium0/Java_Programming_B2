package day21_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectWeekDay {


    public static void main(String[] args) {


        String [] weekDay = {"Monday", "Tusday","Wednesday","Thursday", "friday", "Saturday", "Sunday"};
//when we use -1 in numOfMonth   1         2        3            4          5          6           7
        // if not                0         1         2           3          4          5           6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  a number of week");
        int numOfMonth = input.nextInt();

        if (numOfMonth >= 1 && numOfMonth <=7){
            System.out.println(weekDay[numOfMonth -1]);  // need to use -1

        }else {
            System.out.println("invalid input");
        }
    }
}
