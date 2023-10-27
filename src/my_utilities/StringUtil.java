package my_utilities;

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

}
