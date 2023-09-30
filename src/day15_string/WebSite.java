package day15_string;

import java.util.Scanner;

public class WebSite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.next();

        String  result = "" + url.charAt(4) + url.charAt(5) + url.charAt(6) + url.charAt(7) + url.charAt(8) + url.charAt(9);
        System.out.println(result);


        int  startPoint  = url.indexOf(".")+1;
        System.out.println(startPoint);
        System.out.println(url.substring(startPoint));
    }
}
