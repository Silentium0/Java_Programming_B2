package day11_if_statements;

import java.util.Scanner;

public class Diver {

    public static void main(String [] args){



        Scanner demo = new Scanner(System.in);

        System.out.println("What is your O2 lvl !");
        int dive = demo.nextInt();

        if (dive >= 90) {
            System.out.println("Your tank if full ! ");
        } else if (dive >= 80 ) {
            System.out.println("Still ok !");
        } else if (dive >= 70 ) {
            System.out.println("Don't go too far !");
        } else if (dive >= 60 ){
            System.out.println("Start to head back ! ");
        } else if (dive >= 50){
            System.out.println("Be careful now you are at 50% !");
        }else {
            System.out.println("It is your one way Dive BROHA ");
        }
    }




}
