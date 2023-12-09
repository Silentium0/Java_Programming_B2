package day09_scanner;

import java.util.Scanner;

public class UsingNext {


    public static void main(String[] args) {


        Scanner demo = new Scanner(System.in);

        System.out.print("what is today ? ");
        String day = demo.nextLine();


        System.out.print("enter your first name ");
        String name = demo.next();

        System.out.println("today " + day);
        System.out.println(" first  name  " + name);




    }


}
