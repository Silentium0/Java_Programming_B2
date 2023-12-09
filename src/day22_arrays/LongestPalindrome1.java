package day22_arrays;

public class LongestPalindrome1 {

    /**
     * [IQ] Longest Palindrome
     * Given a String array. Find the longest Palindrome String in your array.
     * Ex:
     * Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
     * Output: racecar
     * Ex:
     * Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
     * Output: No palindrome
     **/


    public static void main(String[] args) {

        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longest = "";

        for (int i = 0; i < arr.length; i++) {

            String eachWord = arr[i];
            String reversed = "";

            for (int j = eachWord.length() - 1; j >= 0; j--) {

                reversed += "" + eachWord.charAt(j);

            }

            if (eachWord.equals(reversed)) {
                if (eachWord.length() > longest.length()) {
                    longest = eachWord;
                }
            }

        }

        System.out.println(longest);


    }


}

