package day27_wrapper_arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>(); // size in the memory is 10
        System.out.println(number);

        number.add(56);
        number.add(-23);
        number.add(344);
        System.out.println(number);
        System.out.println(number.size()); //  will get number of total elements in Array
        System.out.println(number.get(0)); // will get each element
        System.out.println(number.get(2));


    }
}
