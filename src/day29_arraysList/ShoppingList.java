package day29_arraysList;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("apple","banana","cherry","water"));
        StringUtil.stausOfShoppingList(shoppingList);



    }

}
