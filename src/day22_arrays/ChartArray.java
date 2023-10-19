package day22_arrays;

import java.util.Arrays;

public class ChartArray {


    public static void main(String[] args) {

        char[] arr = {'a','e','t','n'};

        for ( char eachChar: arr){
            System.out.println(eachChar);

        }

        String word = "java";
        char [] newArr = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            newArr[i] = word.charAt(i);

        }

        char [] charArr = word.toCharArray(); // short way of loop
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(newArr)); // from loop method


        char [] day = {'w','e','d','n','e','s','d','a','y'};

        String str = Arrays.toString(day);
        System.out.println(str);

        String allTogether = "";
        for (char eachChar : day){
            allTogether+= eachChar;

        }
        System.out.println(allTogether);

        System.out.println("_____________________");

        String str3 = new String(day); // more simple way to convert
        System.out.println(str3);
        System.out.println(str3.substring(0,1).toUpperCase() + str3.substring(1).toLowerCase());






    }
}
