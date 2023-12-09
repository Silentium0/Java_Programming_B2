package day29_arraysList;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    public static void main(String[] args) {


        ArrayList<String> drinks = new ArrayList<>();
        System.out.println(drinks.size());
        drinks.add("cola");
        drinks.add("tea");
        drinks.add("soda");
        System.out.println(drinks);


        ArrayList<String> drink2 = new ArrayList<>(drinks);
        System.out.println(drink2);

        String []  alldrinks = {"red bull","monster","sarikiz"};
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(alldrinks));
        System.out.println(drinks3);

        ArrayList<String> drink4 = new ArrayList<>(Arrays.asList("Water","Dovga","Borjomi"));
        System.out.println(drink4);

        drinks.addAll(1,Arrays.asList("Sprite","fanta")); // by  using index first we assign element where we want
        System.out.println(drinks);




    }
}
