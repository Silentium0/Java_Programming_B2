package day18_loops;

public class Syllables {


    public static void main(String[] args) {

        String str = "ja-va-script";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)== '-'){
                count++;

            }


        }
        System.out.println("syllables: " + (count+1)); // we count just how many syllables  is 3 ( ja va script )
    }
}
