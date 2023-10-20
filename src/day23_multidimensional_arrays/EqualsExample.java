package day23_multidimensional_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = {1,4,3}; // value will be false  if you want true -->  put 2  not 4
        int [] c = a;

        System.out.println(a == b);
        System.out.println(a.length == b.length); // it will compare just array  elements with is  both got  3 elements
        System.out.println(Arrays.equals(a,b)); // it will compare exactly a value of the arrays  put 2 in  b
        System.out.println(a == c);


    }
}
