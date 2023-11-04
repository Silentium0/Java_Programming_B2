package my_utilities;

import java.util.ArrayList;

public class StringUtil {

    /**
     *this method reverses String
     */
    public static String reversed( String word) {
        String reverse = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse +=word.charAt(i);
        }
        return reverse;



    }

    /**
     *
     *  Give you how many   character  exist in String
     */
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    /**
     *   Palindrome  or not  palindrome =  output ( true or false )
     */

    public static boolean isPalindrome(String word) {

        String reversed = "";

        for (int i = word.length() - 1  ; i >=0 ; i--) {
            reversed +=  word.charAt(i);
        }
        return word.equals(reversed);

    }



    /**
     *
     * Will give you index from String
     */

    public static int indexOfSt (String [] str , String word) {

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static void stausOfShoppingList(ArrayList<String> list){
        if (list.isEmpty()){
            System.out.println("Shopping list is empty");
        }else {
            System.out.println("Has items: "+ list);
        }


    }


    /**
     *
     * Reversed each  Character in  array list
     */

    public static ArrayList<String> reversAllChar(ArrayList<String> list) {

        ArrayList<String> reversedList = new ArrayList<>();

        for (String each : list) {
            String str = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                str += each.charAt(i);
            }
            reversedList.add(str);
        }
        return reversedList;

    }

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

}
