package day15_string;

import java.util.Scanner;

public class firstAndLast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence ");
        String sentence = input.nextLine();


        System.out.println("First character " + sentence.charAt(0));



        //System.out.println("First character " + sentence.charAt(4)); // OR
        System.out.println("last character " + sentence.charAt(sentence.length() -1)); // OR it is dynamic

    }
}
