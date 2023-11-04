package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /*
    Remove Countries

    Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
    @param nums - The given ArrayList of numbers @return - ArrayList of numbers
    Ex:
    Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
    Output: "Japan", "Korea", "Turkey", "Canada"
 */


    public static ArrayList<String> removeCountries(ArrayList<String> countries) {
        ArrayList<String> updateCountry = new ArrayList<>(countries);


        updateCountry.removeIf(eachCountry -> eachCountry.length() > 5 ); // remove words more than length 5 you provide

     return updateCountry;

    }

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("japan","Korea","Turkey","Canada","Unite Stated"));

        System.out.println(countries);
        System.out.println(removeCountries(countries));
    }
}
