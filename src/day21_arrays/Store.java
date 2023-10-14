package day21_arrays;

import java.util.Arrays;

public class Store {


    public static void main(String[] args) {


        String[] items = {"Shoes", "jackets", "Gloves", "Phone"};

        System.out.println(Arrays.toString(items).toLowerCase().contains("phone"));
        boolean hasItem = true;


        for (String each : items) {
            if (hasItem) {
                System.out.println("we got this item in store");

            }else {
                System.out.println("we out of stock");
                break;




            }
        }


    }


}
