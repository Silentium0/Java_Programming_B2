package day09_scanner;

import java.util.Scanner;

public class YourInfo {

    /*
        Ask the user to enter their age (byte),
        ask them to enter their favorite number (long),
        and ask them to enter their favorite book
        Print all the values from the inputs
     */





    public static void main (String [] args){

        Scanner demo = new Scanner(System.in); // this is object

        System.out.print("enter your age: ");
         int age = demo.nextInt();
        System.out.print("Enter you favorite number: ");


        long favoriteNumber = demo.nextLong();
        demo.nextLine(); // handle ENTER kei issue
        System.out.print("Enter your favorite book :");
        String book = demo.nextLine();

        System.out.println("your age " + age);
        System.out.println("your  fan number  " + favoriteNumber);
        System.out.println("your  book  " + book);






    }



}
