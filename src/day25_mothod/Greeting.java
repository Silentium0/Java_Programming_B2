package day25_mothod;

import java.util.Scanner;

public class Greeting {


    public static void hello(String name) {
        System.out.println("hello "+ name + " how are you");
    }

    public static void main(String[] args) {
        hello("Sergii"); // after  call method you have to provide a some words
        String name = "Toma";
        hello(name);
        hello("liuda");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = input.next();
        hello(name1);


    }



}
