package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {

    /*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}
    There is two pairs:
    "Cat" and "in"
    "the" and "hat"
    Output:
        {"in", "Cat", "hat", "the”}
 */


    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat","in","the","hat","Apple","water")); // size is 4 elements we need get each 2  so we do in loop i+=2
        System.out.println("Before: "+words);

        for (int i = 0; i < words.size(); i+=2) {
            //System.out.println(words.get(i));

            Collections.swap(words,i,(i+1));
        }
        System.out.println("After: "+words);
    }
}
