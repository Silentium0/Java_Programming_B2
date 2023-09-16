package day09_scanner;

import java.util.Scanner;

public class Angles {







    public static  void main ( String [] args){


        System.out.println("Enter 3  angles  degree ");
        Scanner demo = new Scanner(System.in);
        double angle1 = demo.nextDouble();
        double angle2 = demo.nextDouble();
        double angle3 = demo.nextDouble();

        double total = angle1 + angle2 + angle3;


        boolean is3Triangle = total <=180;
        boolean isCircle = total ==360;

        System.out.println("It is a triangle :" + is3Triangle);
        System.out.println("It is a  circle  :" + isCircle);








    }



}
