package day34_a_static.imports;

import java.util.Arrays;
import  static my_utilities.StringUtil.*;
import static java.util.Arrays.*;
import  static java.lang.Math.*;

public class WithImport {


    public static void main(String[] args) {

        int [] num = {12,345,67,33};
        sort(num); // we need to  import -> import static java.util.Arrays.*; to use method
        System.out.println(Arrays.toString(num));
        System.out.println(PI); //  we import -> import  static java.lang.Math.*;
        System.out.println(reversed("Sergii")); // we import -> import  static my_utilities.StringUtil.*;








    }



}
