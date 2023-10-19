package day22_arrays;

public class ReverseSentence {


    public static void main(String[] args) {


        String sentence = "today is java";

        String [] words = sentence.split(" ");
        System.out.println(words.length);


        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);

        }
        System.out.println("_______");

        for (int i = words.length -1; i >=0 ; i--) {
            System.out.println(words[i]);

        }
        System.out.println("__________");

        String result = "";
        for (int i = words.length -1 ; i >= 0; i--) {
            result += words[i] + " ";

        }
        System.out.println(result.trim());






    }
}
