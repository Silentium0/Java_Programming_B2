package day29_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UsingCollectionClass {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(12,444,6,7,43,9));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);


        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","loop"));
        System.out.println(words);
        Collections.reverse(words);
        System.out.println(words);

        Collections.swap(words,0,1); // swap we return all back how was before
        System.out.println(words);


        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(23,5,44,5,56));
        System.out.println(Collections.frequency(number,5)); // show indexes how many times repeat element in array


        ArrayList<String> word = new ArrayList<>(Arrays.asList("water", "music", "sand","music","music"));
        System.out.println(Collections.frequency(word, "music")); // show indexes how many times repeat element in array




    }



}
