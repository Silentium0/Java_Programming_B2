package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumber {


    public static ArrayList<Integer> sumNumberFromString(ArrayList<String> list) {
        ArrayList<Integer> numSum = new ArrayList<>();

        for (String each: list){
            int sum = 0;

            for (int i = 0; i < each.length(); i++) {
                sum += Integer.parseInt(""+each.charAt(i)); // we convert  String into Integer  so we can add them all together
            }
            numSum.add(sum);
        }
        return numSum;
    }


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","34","234"));
        System.out.println(sumNumberFromString(list));

    }




}
