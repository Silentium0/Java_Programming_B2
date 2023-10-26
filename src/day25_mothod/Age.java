package day25_mothod;

import java.util.Scanner;

public class Age {


    public static void getAge (int birth ){
        if (birth > 2023){
            System.out.println(" You have not  born yet");
        }else {
            System.out.println("Your age is  " + (2023 -  birth));
        }
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birth = input.nextInt();
        getAge(birth);
    }
}
