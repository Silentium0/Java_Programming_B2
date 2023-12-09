package day23_multidimensional_arrays;

import java.util.Arrays;

public class CopyExample {


    public static void main(String[] args) {

        int [] a = {1,56,67,32};
        int [] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        a[0] = 100;
        a[1] = 200;// we assign value to element

        System.out.println(Arrays.toString(a));

        int [] ua = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(ua));

        ua[1] = 345;
        System.out.println(Arrays.toString(ua));

        System.out.println("_______________");

        int [] x = Arrays.copyOf(ua,ua.length+1); // this way we add 2 more elements
        System.out.println(Arrays.toString(x));

        System.out.println("________________");

        int [] r = Arrays.copyOf(ua, ua.length-1); // we deleted element
        System.out.println(Arrays.toString(r));




    }
}
