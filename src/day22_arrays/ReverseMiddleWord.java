package day22_arrays;

public class ReverseMiddleWord {


    public static void main(String[] args) {

        String str = "java always fun";

        String word  [] = str.split(" ");

        String reverse = "";

        for (int i = word[1].length() -1 ; i >=0 ; i--) {
            reverse += word[1].charAt(i);


        }
        System.out.println(reverse);

        word[1] = reverse;
        System.out.println(word[0]+" "+ reverse+" "+ word[2]);
    }
}
