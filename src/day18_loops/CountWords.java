package day18_loops;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CountWords {

    /*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();


        int empty = 0;
        for (int i = 0; i < sentence.length() ; i++) {

            if (sentence.charAt(i) == ' ')
                empty++;

            //System.out.println(sentence.charAt(i));

        }
        System.out.println(empty);
        // it just counts how many  a space





    }
}
