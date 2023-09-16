package day09_scanner;

import java.util.Scanner;

public class Revenue {



    public static void main(String [] args){


        Scanner demo = new Scanner(System.in); // demo: is reference to the object, not variable
                                              //  if we do---> int num = 4 ---> so num in this case is variable name

        System.out.println("Enter the price");
        double  price = demo.nextDouble();
        System.out.print("Enter the Quantity");
        int quantity = demo.nextInt();
        System.out.println("Revenue :$"+ price * quantity);







    }


}
