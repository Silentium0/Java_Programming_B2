package day23_multidimensional_arrays;

import java.util.Arrays;

public class JoinExample {

    public static void main(String[] args) {


        String [] words = {"a", "b", "c"};

        System.out.println(Arrays.toString(words));
        String result  = "";
        for (String each: words){
            result += each + "-";
        }
        System.out.println(result);


        System.out.println("_____________________");

        String resul2 = "";
        for (int i = 0; i < words.length ; i++) {
            resul2 += words[i];

            if (i == words.length -1){
                break;
            }
            resul2 += "-";

        }
        System.out.println(resul2);
        System.out.println("__________________________");

        System.out.println(String.join("*",words));
        System.out.println(String.join("<->",words));
        System.out.println(String.join("=",words));
        System.out.println(String.join(" ",words));

        System.out.println("___________________");

        char [] arr = {'a','r', 't'};
        String str = new String(arr);
        System.out.println(arr);
        System.out.println(str);




    }
}
