package day14_string;

import java.util.Locale;
import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.next();
        username = username.toLowerCase();

        System.out.print("Enter your Password: ");
        String password = input.next();
        //password = password.toLowerCase();

        String actualpassword = "Loopcamp2023";

        if (password.length() > 8 && password.equals(actualpassword)){
            System.out.print("You are logged in");
        }else {
            System.out.println("invalid password");
        }


    }




}
