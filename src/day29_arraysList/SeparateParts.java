package day29_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {


    public static void main(String[] args) {

        String str = "ASBR123@$^&98!^";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("1","2","3","9","8"));
        System.out.println(numbers);

        ArrayList<String> spesial = new ArrayList<>(list);
        spesial.retainAll(Arrays.asList("@","$","^","&","!"));
        System.out.println(spesial);

        System.out.println("_____________________________-");

        ArrayList<String>  letter = new ArrayList<>(list);
        letter.retainAll(Arrays.asList("A","S","B","R"));
        System.out.println(letter);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(spesial);
        System.out.println(letters);







    }
}
